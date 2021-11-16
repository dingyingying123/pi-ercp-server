package cn.com.personnel.ercp.common.kit;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.BodyType;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.MessageBody;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 
 * @author 34351
 *
 */
public class EmailKit implements Serializable {
	private static final long serialVersionUID = 1L;
	    private String mailServer;
	    private String user;
	    private String password;
	    private String domain;

	    public  EmailKit(String mailServer, String user, String password) {
	        this.mailServer = mailServer;
	        this.user = user;
	        this.password = password;
	    }

	    public  EmailKit(String mailServer, String user, String password, String domain) {
	        this.mailServer = mailServer;
	        this.user = user;
	        this.password = password;
	        this.domain = domain;
	    }
	    /**
	     * 创建邮件服务
	     *
	     * @return 邮件服务
	     */
	    public ExchangeService getExchangeService() {
	        ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010);
	        //用户认证信息
	        ExchangeCredentials credentials;
	        if (domain == null) {
	            credentials = new WebCredentials(user, password);
	        } else {
	            credentials = new WebCredentials(user, password, domain);
	        }
	        service.setCredentials(credentials);
	        try {
	            service.setUrl(new URI(mailServer));
	        } catch (URISyntaxException e) {
	            e.printStackTrace();
	        }
	        return service;
	    }
	    /**
	     * 发送带附件的mail
	     *
	     * @param subject         邮件标题
	     * @param to              收件人列表
	     * @param cc              抄送人列表
	     * @param bodyText        邮件内容
	     * @param attachmentPaths 附件地址列表
	     * @throws Exception
	     */
	    public void send(String subject, String[] to, String[] cc, String bodyText, String[] attachmentPaths)
	            throws Exception {
	        ExchangeService service = getExchangeService();

	        EmailMessage msg = new EmailMessage(service);
	        msg.setSubject(subject);
	        MessageBody body = MessageBody.getMessageBodyFromText(bodyText);
	        body.setBodyType(BodyType.HTML);
	        msg.setBody(body);
	        for (String toPerson : to) {
	            msg.getToRecipients().add(toPerson);
	        }
	        if (cc != null) {
	            for (String ccPerson : cc) {
	                msg.getCcRecipients().add(ccPerson);
	            }
	        }
	        if (attachmentPaths != null) {
	            for (String attachmentPath : attachmentPaths) {
	                msg.getAttachments().addFileAttachment(attachmentPath);
	            }
	        }
	        msg.send();
	    }

	    /**
	     * 发送不带附件的mail
	     *
	     * @param subject  邮件标题
	     * @param to       收件人列表
	     * @param cc       抄送人列表
	     * @param bodyText 邮件内容
	     * @throws Exception
	     */
	    public void send(String subject, String[] to, String[] cc, String bodyText) throws Exception {
	        send(subject, to, cc, bodyText, null);
	    } 
	    
}
