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
                    line = line.replace("y_y",data.get("y_y"));
                    line = line.replace("M_M",data.get("M_M"));
                    line = line.replace("d_d",data.get("d_d"));
                    line = line.replace("salary",data.get("salary"));
                    line = line.replace("sex",data.get("sex"));
                    line = line.replace("y_2",data.get("y_2"));
                    line = line.replace("M_2",data.get("M_2"));
                    line = line.replace("d_2",data.get("d_2"));
                    line = line.replace("iheight",data.get("iheight"));
                    line = line.replace("nativePlace",data.get("nativePlace"));


                    line = line.replace("nation",data.get("nation"));
                    line = line.replace("faith",data.get("faith"));
                    line = line.replace("education",data.get("education"));
                    line = line.replace("identity",data.get("identity"));
                    line = line.replace("marriage",data.get("marriage"));
                    line = line.replace("idcard",data.get("idcard"));
                    line = line.replace("idAddress",data.get("idAddress"));
                    line = line.replace("address",data.get("address"));
                    line = line.replace("email",data.get("email"));
                    line = line.replace("name1",data.get("name1"));
                    line = line.replace("name2",data.get("name2"));
                    line = line.replace("name3",data.get("name3"));

                    line = line.replace("relation1",data.get("relation1"));
                    line = line.replace("relation2",data.get("relation2"));
                    line = line.replace("relation3",data.get("relation3"));
                    line = line.replace("agee1",data.get("agee1"));
                    line = line.replace("agee2",data.get("agee2"));
                    line = line.replace("agee3",data.get("agee3"));
                    line = line.replace("profession1",data.get("profession1"));


                    line = line.replace("profession2",data.get("profession2"));
                    line = line.replace("profession3",data.get("profession3"));
                    line = line.replace("company11",data.get("company11"));
                    line = line.replace("company12",data.get("company12"));
                    line = line.replace("company13",data.get("company13"));
                    line = line.replace("phone1",data.get("phone1"));
                    line = line.replace("phone2",data.get("phone2"));
                    line = line.replace("phone3",data.get("phone3"));
                    line = line.replace("name4",data.get("name4"));
                    line = line.replace("name5",data.get("name5"));
                    line = line.replace("department1",data.get("department1"));
                    line = line.replace("department2",data.get("department2"));
                    line = line.replace("position1",data.get("position1"));
                    line = line.replace("position2",data.get("position2"));
                    line = line.replace("phone4",data.get("phone4"));
                    line = line.replace("phone5",data.get("phone5"));
                    line = line.replace("relation4",data.get("relation4"));
                    line = line.replace("relation5",data.get("relation5"));
                    line = line.replace("school1",data.get("school1"));
                    line = line.replace("y_3",data.get("y_3"));
                    line = line.replace("M_3",data.get("M_3"));
                    line = line.replace("y_4",data.get("y_4"));
                    line = line.replace("M_4",data.get("M_4"));
                    line = line.replace("major1",data.get("major1"));
                    line = line.replace("certificate1",data.get("certificate1"));
                    line = line.replace("school2",data.get("school2"));
                    line = line.replace("y_5",data.get("y_5"));
                    line = line.replace("M_5",data.get("M_5"));
                    line = line.replace("y_6",data.get("y_6"));
                    line = line.replace("M_6",data.get("M_6"));
                    line = line.replace("major2",data.get("major2"));
                    line = line.replace("certificate2",data.get("certificate2"));
                    line = line.replace("school3",data.get("school3"));
                    line = line.replace("y_7",data.get("y_7"));
                    line = line.replace("M_7",data.get("M_7"));
                    line = line.replace("y_8",data.get("y_8"));
                    line = line.replace("M_8",data.get("M_8"));
                    line = line.replace("major3",data.get("major3"));
                    line = line.replace("certificate3",data.get("certificate3"));
                    line = line.replace("school4",data.get("school4"));
                    line = line.replace("y_9",data.get("y_9"));
                    line = line.replace("M_9",data.get("M_9"));
                    line = line.replace("y_10",data.get("y_10"));
                    line = line.replace("M_10",data.get("M_10"));
                    line = line.replace("major4",data.get("major4"));
                    line = line.replace("certificate4",data.get("certificate4"));
                    line = line.replace("training1",data.get("training1"));
                    line = line.replace("time1",data.get("time1"));
                    line = line.replace("course1",data.get("course1"));
                    line = line.replace("certificate5",data.get("certificate5"));
                    line = line.replace("training2",data.get("training2"));
                    line = line.replace("time2",data.get("time2"));
                    line = line.replace("course2",data.get("course2"));
                    line = line.replace("certificate6",data.get("certificate6"));
                    line = line.replace("training3",data.get("training3"));
                    line = line.replace("time3",data.get("time3"));
                    line = line.replace("course3",data.get("course3"));
                    line = line.replace("certificate7",data.get("certificate7"));
                    line = line.replace("speak1",data.get("speak1"));
                    line = line.replace("speak2",data.get("speak2"));
                    line = line.replace("speak3",data.get("speak3"));
                    line = line.replace("read1",data.get("read1"));
                    line = line.replace("read2",data.get("read2"));
                    line = line.replace("read3",data.get("read3"));
                    line = line.replace("write1",data.get("write1"));
                    line = line.replace("write2",data.get("write2"));
                    line = line.replace("write3",data.get("write3"));
                    line = line.replace("elsela",data.get("elsela"));
                    line = line.replace("speak4",data.get("speak4"));
                    line = line.replace("speak5",data.get("speak5"));
                    line = line.replace("speak6",data.get("speak6"));
                    line = line.replace("read4",data.get("read4"));
                    line = line.replace("read5",data.get("read5"));
                    line = line.replace("read6",data.get("read6"));
                    line = line.replace("write4",data.get("write4"));
                    line = line.replace("write5",data.get("write5"));
                    line = line.replace("write6",data.get("write6"));
                    line = line.replace("enlevel",data.get("enlevel"));
                    line = line.replace("hobby",data.get("hobby"));
                    line = line.replace("health",data.get("health"));
                    line = line.replace("company21",data.get("company21"));
                    line = line.replace("post21",data.get("post21"));
                    line = line.replace("ym1",data.get("ym1"));
                    line = line.replace("reason1",data.get("reason1"));
                    line = line.replace("witness1",data.get("witness1"));
                    line = line.replace("company22",data.get("company22"));
                    line = line.replace("post22",data.get("post22"));
                    line = line.replace("ym2",data.get("ym2"));
                    line = line.replace("reason2",data.get("reason2"));
                    line = line.replace("witness2",data.get("witness2"));
                    line = line.replace("company23",data.get("company23"));
                    line = line.replace("post23",data.get("post23"));
                    line = line.replace("ym3",data.get("ym3"));
                    line = line.replace("reason3",data.get("reason3"));
                    line = line.replace("witness3",data.get("witness3"));
                    line = line.replace("company24",data.get("company24"));
                    line = line.replace("post24",data.get("post24"));
                    line = line.replace("ym4",data.get("ym4"));
                    line = line.replace("reason4",data.get("reason4"));
                    line = line.replace("witness4",data.get("witness4"));
                    line = line.replace("understand",data.get("understand"));
                    line = line.replace("name6",data.get("name6"));
                    line = line.replace("relation6",data.get("relation6"));
                    line = line.replace("soslocation0",data.get("soslocation0"));
                    line = line.replace("phone6",data.get("phone6"));
                    line = line.replace("name7",data.get("name7"));
                    line = line.replace("relation7",data.get("relation7"));
                    line = line.replace("soslocation1",data.get("soslocation1"));
                    line = line.replace("phone7",data.get("phone7"));
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
