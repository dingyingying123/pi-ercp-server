package cn.com.personnel.ercp.common.util;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.MalformedURLException;

/**
 * ftp上传下载工具类
 */
public class FtpUtil {

	//ftp服务器地址
	public String hostname = "10.1.248.94";
	//ftp服务器端口号默认为21
	public Integer port = 21;
	//ftp登录账号
	public String username = "sf";
	//ftp登录密码
	public String password = "sf@123456";

	public FTPClient ftpClient = null;


	/**
	 * 初始化ftp服务器
	 */
	public void initFtpClient() {
		ftpClient = new FTPClient();
		ftpClient.setControlEncoding("utf-8");
		try {
			System.out.println("connecting...ftp服务器:" + this.hostname + ":" + this.port);
			//连接ftp服务器
			System.out.println("连接状态" + ftpClient.isConnected());
			ftpClient.connect(hostname, port);
			//登录ftp服务器
			ftpClient.login(username, password);
			//是否成功登录服务器
			int replyCode = ftpClient.getReplyCode();
			if (!FTPReply.isPositiveCompletion(replyCode)) {
				System.out.println("connect failed...ftp服务器:" + this.hostname + ":" + this.port);
			}
			System.out.println("connect successfu...ftp服务器:" + this.hostname + ":" + this.port);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 上传文件
	 *
	 * @param pathname       ftp服务保存地址
	 * @param fileName       上传到ftp的文件名
	 * @param originfilename 待上传文件的名称（绝对地址） *
	 * @return
	 */
	public boolean uploadFile(String pathname, String fileName, String originfilename) {
		boolean flag = false;
		InputStream inputStream = null;
		try {
			System.out.println("开始上传文件");
			inputStream = new FileInputStream(new File(originfilename));
			initFtpClient();
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			boolean result = createDirecroty(pathname);
			if(result){
				ftpClient.makeDirectory(pathname);
				ftpClient.changeWorkingDirectory(pathname);
				ftpClient.enterLocalPassiveMode();
				ftpClient.storeFile(fileName, inputStream);
				inputStream.close();
				ftpClient.logout();
				flag = true;
				System.out.println("上传文件成功");
			}
		} catch (Exception e) {
			System.out.println("上传文件失败");
			e.printStackTrace();
		} finally {
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (null != inputStream) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	//改变目录路径
	public boolean changeWorkingDirectory(String directory) {
		boolean flag = true;
		try {
			flag = ftpClient.changeWorkingDirectory(directory);
			if (flag) {
				System.out.println("进入文件夹" + directory + " 成功！");
			} else {
				System.out.println("进入文件夹" + directory + " 失败！开始创建文件夹");
				flag = false;
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return flag;
	}

	//创建多层目录文件，如果有ftp服务器已存在该文件，则不创建，如果无，则创建
	public boolean createDirecroty(String remote) throws IOException {
		boolean success = true;
		String directory = remote + "/";
		// 如果远程目录不存在，则递归创建远程服务器目录
		if (!directory.equalsIgnoreCase("/") && !changeWorkingDirectory(new String(directory))) {
			int start = 0;
			int end = 0;
			if (directory.startsWith("/")) {
				start = 1;
			} else {
				start = 0;
			}
			end = directory.indexOf("/", start);
			String path = "";
			String paths = "";
			while (true) {
				String subDirectory = new String(remote.substring(start, end).getBytes("GBK"), "iso-8859-1");
				System.out.println("subdirectory========" + subDirectory);
				path = path + "/" + subDirectory;
				if (!existFile(path)) {
					if (makeDirectory(subDirectory)) {
						success = changeWorkingDirectory(subDirectory);
					} else {
						System.out.println("创建目录[" + subDirectory + "]失败");
						success = changeWorkingDirectory(subDirectory);
					}
				} else {
					success = changeWorkingDirectory(subDirectory);
				}

				paths = paths + "/" + subDirectory;
				System.out.println("paths========" + paths);
				start = end + 1;
				end = directory.indexOf("/", start);
				// 检查所有目录是否创建完毕
				if (end <= start) {
					break;
				}
			}
		}
		return success;
	}

	//判断ftp服务器文件是否存在
	public boolean existFile(String path) throws IOException {
		boolean flag = false;
		FTPFile[] ftpFileArr = ftpClient.listFiles(path);
		if (ftpFileArr.length > 0) {
			flag = true;
		}
		return flag;
	}

	//创建目录
	public boolean makeDirectory(String dir) {
		boolean flag = true;
		try {
			flag = ftpClient.makeDirectory(dir);
			if (flag) {
				System.out.println("创建文件夹" + dir + " 成功！");
			} else {
				System.out.println("创建文件夹" + dir + " 失败！");
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


	//ftp上传文件测试main函数
	public static void main(String[] args) throws FileNotFoundException {
		FtpUtil ftp = new FtpUtil();
		ftp.uploadFile("/2018/09/13","金风档案系统-数据集成方案-webservice_v1.0.doc","/Users/heliang.wang/Downloads/金风档案系统-数据集成方案-webservice_v1.0.doc");


	}
}  