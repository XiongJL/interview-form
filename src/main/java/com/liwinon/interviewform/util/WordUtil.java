package com.liwinon.interviewform.util;

import java.io.*;
import java.util.Map;

/**
 *  word文档工具类,首先将word另存为xml后操作
 */
public class WordUtil {
    //由于word转换的xml 只有第三行是存的内容,所以判断存在所需数据的行,
    // 处理完即可.但是要导出doc.所以要保存所有行


    public static String redFileContent(String Path, Map<String,String>data){
//        String name = "熊健淋";
//        String phone = "18483652558";
        BufferedReader br = null;
        String line = null;
        StringBuffer bufAll = new StringBuffer();  //保存修改过后的所有内容，不断增加
        try{
            br = new BufferedReader(new FileReader(Path));
            while ((line = br.readLine())!=null){
                StringBuffer buf = new StringBuffer();
                //匹配修改
                if (line.indexOf("idcard")!=-1){
                    line = line.replace("iname",data.get("iname"));
                    line = line.replace("phone",data.get("phone"));
                    line = line.replace("post",data.get("post"));
                    line = line.replace("yy",data.get("yy"));
                    line = line.replace("MM",data.get("MM"));
//                    line = line.replace("dd",data.get("dd"));
//                    line = line.replace("salary",data.get("salary"));
//                    line = line.replace("sex",data.get("sex"));
//                    line = line.replace("y2",data.get("y2"));
//                    line = line.replace("M2",data.get("M2"));
//                    line = line.replace("d2",data.get("d2"));
//                    line = line.replace("height",data.get("height"));
//                    line = line.replace("nativePlace",data.get("nativePlace"));
//                    line = line.replace("nation",data.get("nation"));
//                    line = line.replace("faith",data.get("faith"));
//                    line = line.replace("education",data.get("education"));
//                    line = line.replace("identity",data.get("identity"));
//                    line = line.replace("marriage",data.get("marriage"));
//                    line = line.replace("idcard",data.get("idcard"));
//                    line = line.replace("idAddress",data.get("idAddress"));
//                    line = line.replace("address",data.get("address"));
//                    line = line.replace("email",data.get("email"));
//                    line = line.replace("name1",data.get("name1"));
//                    line = line.replace("name2",data.get("name2"));
//                    line = line.replace("name3",data.get("name3"));
//                    line = line.replace("relation1",data.get("relation1"));
//                    line = line.replace("relation2",data.get("relation2"));
//                    line = line.replace("relation3",data.get("relation3"));
//                    line = line.replace("age1",data.get("age1"));
//                    line = line.replace("age2",data.get("age2"));
//                    line = line.replace("age3",data.get("age3"));
//                    line = line.replace("profession1",data.get("profession1"));
//                    line = line.replace("profession2",data.get("profession2"));
//                    line = line.replace("profession3",data.get("profession3"));
//                    line = line.replace("company1",data.get("company1"));
//                    line = line.replace("company2",data.get("company2"));
//                    line = line.replace("company3",data.get("company3"));
//                    line = line.replace("phone1",data.get("phone1"));
//                    line = line.replace("phone2",data.get("phone2"));
//                    line = line.replace("phone3",data.get("phone3"));
//                    line = line.replace("name4",data.get("name4"));
//                    line = line.replace("name5",data.get("name5"));
//                    line = line.replace("department1",data.get("department1"));
//                    line = line.replace("department2",data.get("department2"));
//                    line = line.replace("position1",data.get("position1"));
//                    line = line.replace("position2",data.get("position2"));
//                    line = line.replace("phone4",data.get("phone4"));
//                    line = line.replace("relation4",data.get("relation4"));
//                    line = line.replace("relation5",data.get("relation5"));


                }
                buf.append(line);
                buf.append(System.getProperty("line.separator"));
                bufAll.append(buf);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (br!=null){
                try{
                    br.close();
                }catch (IOException e){
                    br = null;
                }
            }
        }
        return bufAll.toString();
    }

    /**
     *  写到指定目录里
     * @param filePath
     * @param content
     */
    public static void writeFile(String filePath,String content){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(content);
        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                }catch (IOException e){
                    bw = null;
                }
            }
        }
    }
}
