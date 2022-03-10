package cn.com.personnel.ercp;

import cn.com.personnel.ercp.framework.kit.UUIDKit;

public class TestMain {
    public static void main(String[] args){
//        String userId="52972";
//        String md5 =  DigestUtils.md5DigestAsHex((userId + "@"+ "sfs#goldwind123").getBytes());
//        String url = "http://sfs.goldwind.com.cn/xd/sfs_xd/autoLogin/autoLogin?userId="+userId+"&sign="+md5;
//        System.out.println(url);
        for(int i = 0; i < 389; i++) {
            System.out.println(UUIDKit.getUUID());
        }
//        String o = " 65050220150000075";
//        System.out.println(o.trim());
//        o = o.replace((char) 12288, ' ');
//        System.out.println(o.trim());
//        o = o.replaceAll("\\u00A0","");
//        System.out.println(o.trim());
//        }
//        String ss = "2021-05-10 13:31:00";
//        System.out.println(DateUtils.isDate(ss));

//        try{
//            String pdfFile = "D:\\work\\技术学院\\教育学/高等教育学教材.pdf";
//            PDDocument doc = PDDocument.load(new File(pdfFile));
//            int pagenumber = doc.getNumberOfPages();
//            pdfFile = pdfFile.substring(0, pdfFile.lastIndexOf("."));
//            String fileName = pdfFile + ".doc";
//            File file = new File(fileName);
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            FileOutputStream fos = new FileOutputStream(fileName);
//            Writer writer = new OutputStreamWriter(fos, "UTF-8");
//            PDFTextStripper stripper = new PDFTextStripper();
//            stripper.setSortByPosition(true);// 排序
//            stripper.setStartPage(1);// 设置转换的开始页
//            stripper.setEndPage(pagenumber);// 设置转换的结束页
//            stripper.writeText(doc, writer);
//            writer.close();
//            doc.close();
//            System.out.println("pdf转换word成功！");
//
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
    }
}

//import java.io.File;
//        import java.io.FileOutputStream;
//        import java.io.IOException;
//        import java.io.OutputStreamWriter;
//        import java.io.Writer;
//
//        import org.apache.pdfbox.pdmodel.PDDocument;
//        import org.apache.pdfbox.util.PDFTextStripper;

//public class PdfToWord{
//    public static void main(String[] args){
//        try{
//            String pdfFile = "C:/xxxxx.pdf";
//            PDDocument doc = PDDocument.load(new File(pdfFile));
//            int pagenumber = doc.getNumberOfPages();
//            pdfFile = pdfFile.substring(0, pdfFile.lastIndexOf("."));
//            String fileName = pdfFile + ".doc";
//            File file = new File(fileName);
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            FileOutputStream fos = new FileOutputStream(fileName);
//            Writer writer = new OutputStreamWriter(fos, "UTF-8");
//            PDFTextStripper stripper = new PDFTextStripper();
//            stripper.setSortByPosition(true);// 排序
//            stripper.setStartPage(1);// 设置转换的开始页
//            stripper.setEndPage(pagenumber);// 设置转换的结束页
//            stripper.writeText(doc, writer);
//            writer.close();
//            doc.close();
//            System.out.println("pdf转换word成功！");
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}　　代码所用到的jar包 pdfbox-1.8.2.jar 另行下载