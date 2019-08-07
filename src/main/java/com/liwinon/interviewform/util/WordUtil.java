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
        BufferedReader br = null;
        String line = null;
        StringBuffer bufAll = new StringBuffer();  //保存修改过后的所有内容，不断增加
        try{
            br = new BufferedReader(new FileReader(Path));
            while ((line = br.readLine())!=null){
                StringBuffer buf = new StringBuffer();
                //匹配修改
                if (line.indexOf("idcard")!=-1){
                  //  System.out.println("sosname0:"+data.get("sosname0"));
                    line = line.replace("iname0",data.get("iname0"));
                    line = line.replace("iname2",data.get("iname0"));
                    line = line.replace("phone0",data.get("phone0"));
                    line = line.replace("post0",data.get("post0"));
                    line = line.replace("postDate0",data.get("postDate0"));
                    line = line.replace("borndate",data.get("borndate"));
                    line = line.replace("sex",data.get("sex"));
                    line = line.replace("iheight",data.get("iheight"));
                    line = line.replace("nativePlace",data.get("nativePlace"));

                    line = line.replace("nation",data.get("nation"));
                    line = line.replace("faith",data.get("faith"));
                    line = line.replace("identity",data.get("identity"));
                    line = line.replace("marriage",data.get("marriage"));
                    line = line.replace("idcard",data.get("idcard"));
                    line = line.replace("idAddress",data.get("idAddress"));
                    line = line.replace("address",data.get("address"));

                    line = line.replace("date2",data.get("date2"));
                    line = line.replace("date3",data.get("date3"));
                    line = line.replace("date4",data.get("date4"));
                    line = line.replace("date5",data.get("date5"));
                    line = line.replace("date6",data.get("date6"));
                    line = line.replace("date7",data.get("date7"));
                    line = line.replace("date8",data.get("date8"));
                    line = line.replace("date9",data.get("date9"));
                    line = line.replace("dates1",data.get("dates1"));

                    line = line.replace("member1",data.get("member1"));
                    line = line.replace("member2",data.get("member2"));
                    line = line.replace("member3",data.get("member3"));

                    line = line.replace("relation1",data.get("relation1"));
                    line = line.replace("relation2",data.get("relation2"));
                    line = line.replace("relation3",data.get("relation3"));
                    line = line.replace("relation4",data.get("relation4"));
                    line = line.replace("relation5",data.get("relation5"));

                    line = line.replace("name1",data.get("name1"));
                    line = line.replace("name4",data.get("name4"));
                    line = line.replace("name5",data.get("name5"));

                    line = line.replace("phone1",data.get("phone1"));
                    line = line.replace("phone2",data.get("phone2"));
                    line = line.replace("phone3",data.get("phone3"));
                    line = line.replace("phone4",data.get("phone4"));
                    line = line.replace("phone5",data.get("phone5"));
                    line = line.replace("phone6",data.get("phone6"));

                    line = line.replace("profession1",data.get("profession1"));
                    line = line.replace("profession2",data.get("profession2"));
                    line = line.replace("profession3",data.get("profession3"));

                    line = line.replace("company1",data.get("company1"));
                    line = line.replace("company2",data.get("company2"));
                    line = line.replace("company3",data.get("company3"));
                    line = line.replace("company4",data.get("company4"));
                    line = line.replace("company5",data.get("company5"));
                    line = line.replace("company6",data.get("company6"));

                    line = line.replace("department1",data.get("department1"));
                    line = line.replace("department2",data.get("department2"));

                    line = line.replace("position1",data.get("position1"));
                    line = line.replace("position2",data.get("position2"));

                    line = line.replace("school1",data.get("school1"));
                    line = line.replace("school2",data.get("school2"));
                    line = line.replace("school3",data.get("school3"));

                    line = line.replace("major1",data.get("major1"));
                    line = line.replace("major2",data.get("major2"));
                    line = line.replace("major3",data.get("major3"));

                    line = line.replace("education0",data.get("education0"));
                    line = line.replace("education1",data.get("education1"));
                    line = line.replace("education2",data.get("education2"));
                    line = line.replace("education3",data.get("education3"));

                    line = line.replace("aDegree1",data.get("aDegree1"));
                    line = line.replace("aDegree2",data.get("aDegree2"));
                    line = line.replace("aDegree3",data.get("aDegree3"));

                    line = line.replace("content1",data.get("content1"));
                    line = line.replace("content2",data.get("content2"));
                    line = line.replace("content3",data.get("content3"));

                    line = line.replace("course1",data.get("course1"));
                    line = line.replace("course2",data.get("course2"));
                    line = line.replace("course3",data.get("course3"));

                    line = line.replace("train1",data.get("train1"));
                    line = line.replace("train2",data.get("train2"));
                    line = line.replace("train3",data.get("train3"));

                    line = line.replace("post1",data.get("post1"));
                    line = line.replace("post2",data.get("post2"));
                    line = line.replace("post3",data.get("post3"));

                    line = line.replace("witness1",data.get("witness1"));
                    line = line.replace("witness2",data.get("witness2"));
                    line = line.replace("witness3",data.get("witness3"));

                    line = line.replace("reason1",data.get("reason1"));
                    line = line.replace("reason2",data.get("reason2"));
                    line = line.replace("reason3",data.get("reason3"));

                    line = line.replace("enlevel",data.get("enlevel"));
                    line = line.replace("otherLevel",data.get("otherLevel"));
                    line = line.replace("hobby",data.get("hobby"));
                    line = line.replace("health",data.get("health"));
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
