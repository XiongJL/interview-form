package com.liwinon.interviewform.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class mainServiceImpl implements mainService {

    @Override
    public Map<String,String> saveinfo(HttpServletRequest request) {
        Map<String,String> data = new HashMap<>();
        String iname0 = request.getParameter("iname").trim();
        data.put("iname0",iname0);
        data.put("iname2",iname0);
        String phone0 = request.getParameter("phone0").trim();
        data.put("phone0",phone0);
        String post0 = request.getParameter("post").trim();
        data.put("post0",post0);
        String date1 = request.getParameter("date1").trim();
        String[] ds = date1.split("-");
        String y_y = ds[0];
        String M_M = ds[1];
        String d_d = ds[2];
        data.put("y_y",y_y);
        data.put("M_M",M_M);
        data.put("d_d",d_d);
        String salary = request.getParameter("salary").trim();
        data.put("salary",salary);
        String sex = request.getParameter("sex").trim();
        data.put("sex",sex);
        String date2 = request.getParameter("date2").trim();
        String[] ds2 = date2.split("-");
        String y_2 = ds2[0];
        String M_2 = ds2[1];
        String d_2 = ds2[2];
        data.put("y_2",y_2);
        data.put("M_2",M_2);
        data.put("d_2",d_2);
        String iheight = request.getParameter("iheight").trim();
        data.put("iheight",iheight);
        String nativePlace = request.getParameter("nativePlace").trim();
        if(nativePlace!=null && nativePlace!=""){
            data.put("nativePlace",nativePlace);
        }else{
            data.put("nativePlace","");
        }

        String nation = request.getParameter("nation").trim();
        data.put("nation",nation);
        String faith = request.getParameter("faith").trim();
        if (faith==null||faith==""){
            data.put("faith","无");
        }else{
            data.put("faith",faith);
        }
        String education = request.getParameter("education").trim();
        data.put("education",education);
        String identity = request.getParameter("identity").trim();
        data.put("identity",identity);
        String marriage = request.getParameter("marriage").trim();
        data.put("marriage",marriage);
        String idcard = request.getParameter("idcard").trim();
        data.put("idcard",idcard);
        String idAddress = request.getParameter("idAddress").trim();
        data.put("idAddress",idAddress);
        String address = request.getParameter("address").trim();
        data.put("address",address);
        String email = request.getParameter("email").trim();
        if (email==null||email==""){
            data.put("email","无");
        }else{
            data.put("email",email);
        }


        String[] family1 = request.getParameterValues("family1");
        String name1 = family1[0];
        String relation1 = family1[1];
        String age1 = family1[2];
        String profession1 = family1[3];
        String company11 = family1[4];
        String phone1 = family1[5];
        data.put("name1",name1);
        data.put("relation1",relation1);
        data.put("age1",age1);
        data.put("profession1",profession1);
        data.put("company11",company11);
        data.put("phone1",phone1);
        String[] family2 = request.getParameterValues("family2");
        String name2 = "";
        String relation2 = "";
        String age2 = "";
        String profession2 = "";
        String company12 = "";
        String phone2 = "";
        if (family2!=null && family2.length>0){
             name2 = family2[0];
             relation2 = family2[1];
             age2 = family2[2];
             profession2 = family2[3];
             company12 = family2[4];
             phone2 = family2[5];
        }
        data.put("name2",name2);
        data.put("relation2",relation2);
        data.put("age2",age2);
        data.put("profession2",profession2);
        data.put("company12",company12);
        data.put("phone2",phone2);

        String[] family3 = request.getParameterValues("family3");
        String name3 = "";
        String relation3 = "";
        String age3 = "";
        String profession3 = "";
        String company13 = "";
        String phone3 = "";
        if (family3!=null && family3.length>0){
             name3 = family3[0];
             relation3 = family3[1];
             age3 = family3[2];
             profession3 = family2[3];
             company13 = family3[4];
             phone3 = family3[5];
        }
        data.put("name3",name3);
        data.put("relation3",relation3);
        data.put("age3",age3);
        data.put("profession3",profession3);
        data.put("company13",company13);
        data.put("phone3",phone3);

        String[] friend1 = request.getParameterValues("friend1");
        String name4 = "";
        String department1 =  "";
        String position1 =  "";
        String phone4 = "";
        String relation4 = "";
        if (friend1!=null && friend1.length>0){
             name4 = friend1[0];
             department1 = friend1[1];
             position1 = friend1[2];
             phone4 = friend1[3];
             relation4 = friend1[4];
        }
        data.put("name4",name4);
        data.put("department1",department1);
        data.put("position1",position1);
        data.put("phone4",phone4);
        data.put("relation4",relation4);

        String[] friend2 = request.getParameterValues("friend2");
        String name5 = "";
        String department2 =  "";
        String position2 =  "";
        String phone5 = "";
        String relation5 = "";
        if (friend2!=null && friend2.length>0){
             name5 = friend2[0];
             department2 = friend2[1];
             position2 = friend2[2];
             phone5 = friend2[3];
             relation5 = friend2[4];

        }
        data.put("name5",name5);
        data.put("department2",department2);
        data.put("position2",position2);
        data.put("phone5",phone5);
        data.put("relation5",relation5);

        String school1 = request.getParameter("school1").trim();
        if(school1!=null && school1!=""){
            data.put("school1",school1);
        }else{
            data.put("school1","");
        }
        String scdate11 = request.getParameter("scdate11").trim();
        String y_3 = "";
        String M_3 = "";
        String y_4 = "";
        String M_4 = "";
        if(scdate11!=null && scdate11!=""){
            String[] scs = scdate11.split("-");
            y_3 = scs[0];
            M_3 = scs[1];
        }
        data.put("y_3",y_3);
        data.put("M_3",M_3);
        String scdate12 = request.getParameter("scdate12").trim();
        if(scdate12!=null && scdate12!=""){
            String[] scs = scdate12.split("-");
            y_4 = scs[0];
            M_4 = scs[1];
        }
        data.put("y_4",y_4);
        data.put("M_4",M_4);
        String major1 = request.getParameter("major1").trim();
        if(major1!=null && major1!=""){
            data.put("major1",major1);
        }else{
            data.put("major1","");
        }
        String certificate1 = request.getParameter("certificate1").trim();
        if(certificate1!=null && certificate1!=""){
            data.put("certificate1",certificate1);
        }else{
            data.put("certificate1","");
        }
        String school2 = request.getParameter("school2");
        if(school2!=null && school2!=""){
            data.put("school2",school2.trim());
        }else{
            data.put("school2","");
        }
        String y_5 = "";
        String M_5 = "";
        String y_6 = "";
        String M_6 = "";
        String scdate21 = request.getParameter("scdate21");
        if(scdate21!=null && scdate21!=""){
            String[] scs = scdate21.split("-");
            y_5 = scs[0];
            M_5 = scs[1];
        }
        data.put("y_5",y_5);
        data.put("M_5",M_5);
        String scdate22 = request.getParameter("scdate22");
        if(scdate22!=null && scdate22!=""){
            String[] scs = scdate22.split("-");
            y_6 = scs[0];
            M_6 = scs[1];
        }
        data.put("y_6",y_6);
        data.put("M_6",M_6);
        String major2 = request.getParameter("major2");
        if(major2!=null && major2!=""){
            data.put("major2",major2.trim());
        }else{
            data.put("major2","");
        }
        String certificate2 = request.getParameter("certificate2");
        if(certificate2!=null && certificate2!=""){
            data.put("certificate2",certificate2.trim());
        }else{
            data.put("certificate2","");
        }
        String school3 = request.getParameter("school3");
        if(school3!=null && school3!=""){
            data.put("school3",school3.trim());
        }else{
            data.put("school3","");
        }
        String y_7 = "";
        String M_7 = "";
        String y_8 = "";
        String M_8 = "";
        String scdate31 = request.getParameter("scdate31");
        if(scdate31!=null && scdate31!=""){
            String[] scs = scdate31.split("-");
            y_7 = scs[0];
            M_7 = scs[1];
        }
        data.put("y_7",y_7);
        data.put("M_7",M_7);

        String scdate32 = request.getParameter("scdate32");
        if(scdate32!=null && scdate32!=""){
            String[] scs = scdate32.split("-");
            y_8 = scs[0];
            M_8 = scs[1];
        }
        data.put("y_8",y_8);
        data.put("M_8",M_8);
        String major3 = request.getParameter("major3");
        if(major3!=null && major3!=""){
            data.put("major3",major3.trim());
        }else{
            data.put("major3","");
        }
        String certificate3 = request.getParameter("certificate3");
        if(certificate3!=null && certificate3!=""){
            data.put("certificate3",certificate3.trim());
        }else{
            data.put("certificate3","");
        }
        String school4 = request.getParameter("school4");
        if(school4!=null && school4!=""){
            data.put("school4",school4.trim());
        }else{
            data.put("school4","");
        }
        String y_9 = "";
        String M_9 = "";
        String y_10 = "";
        String M_10 = "";
        String scdate41 = request.getParameter("scdate41");
        if(scdate41!=null && scdate41!=""){
            String[] scs = scdate41.split("-");
            y_9 = scs[0];
            M_9 = scs[1];
        }
        data.put("y_9",y_9);
        data.put("M_9",M_9);
        String scdate42 = request.getParameter("scdate42");
        if(scdate42!=null && scdate42!=""){
            String[] scs = scdate42.split("-");
            y_10 = scs[0];
            M_10 = scs[1];
        }
        data.put("y_10",y_10);
        data.put("M_10",M_10);
        String major4 = request.getParameter("major4");
        if(major4!=null && major4!=""){
            data.put("major4",major4.trim());
        }else{
            data.put("major4","");
        }
        String certificate4 = request.getParameter("certificate4");
        if(certificate4!=null && certificate4!=""){
            data.put("certificate4",certificate4.trim());
        }else{
            data.put("certificate4","");
        }
        String training1 = request.getParameter("training1");
        if(training1!=null && training1!=""){
            data.put("training1",training1.trim());
        }else{
            data.put("training1","");
        }
        String time1 = request.getParameter("time1");
        if(time1!=null && time1!=""){
            data.put("time1",time1.trim());
        }else{
            data.put("time1","");
        }
        String course1 = request.getParameter("course1");
        if(course1!=null && course1!=""){
            data.put("course1",course1.trim());
        }else{
            data.put("course1","");
        }
        String certificate5 = request.getParameter("certificate5");
        if(certificate5!=null && certificate5!=""){
            data.put("certificate5",certificate5.trim());
        }else{
            data.put("certificate5","");
        }
        String training2 = request.getParameter("training2");
        if(training2!=null && training2!=""){
            data.put("training2",training2.trim());
        }else{
            data.put("training2","");
        }
        String time2 = request.getParameter("time2");
        if(time2!=null && time2!=""){
            data.put("time2",time2.trim());
        }else{
            data.put("time2","");
        }
        String course2 = request.getParameter("course2");
        if(course2!=null && course2!=""){
            data.put("course2",course2.trim());
        }else{
            data.put("course2","");
        }
        String certificate6 = request.getParameter("certificate6");
        if(certificate6!=null && certificate6!=""){
            data.put("certificate6",certificate6.trim());
        }else{
            data.put("certificate6","");
        }
        String training3 = request.getParameter("training3");
        if(training3!=null && training3!=""){
            data.put("training3",training3.trim());
        }else{
            data.put("training3","");
        }
        String time3 = request.getParameter("time3");
        if(time3!=null && time3!=""){
            data.put("time3",time3.trim());
        }else{
            data.put("time3","");
        }
        String course3 = request.getParameter("course3");
        if(course3!=null && course3!=""){
            data.put("course3",course3.trim());
        }else{
            data.put("course3","");
        }
        String certificate7 = request.getParameter("certificate7");
        if(certificate7!=null && certificate7!=""){
            data.put("certificate7",certificate7.trim());
        }else{
            data.put("certificate7","");
        }
        String enspeak = request.getParameter("enspeak").trim();
        String speak1 = "";
        String speak2 = "";
        String speak3 = "";
        if(enspeak=="优秀"){
            speak1 = "√";
        }
        else if(enspeak=="一般"){
            speak2 = "√";
        } else{
            speak3 = "√";
        }
        data.put("speak1",speak1);
        data.put("speak2",speak2);
        data.put("speak3",speak3);
        String enread = request.getParameter("enread").trim();
        String read1 = "";
        String read2 = "";
        String read3 = "";
        if("优秀".equals(enread)){
            read1 = "√";
        }
        else if("一般".equals(enread)){
            read2 = "√";
        } else{
            read3 = "√";
        }
        data.put("read1",read1);
        data.put("read2",read2);
        data.put("read3",read3);
        String enwrite = request.getParameter("enwrite").trim();
        String write1 = "";
        String write2 = "";
        String write3 = "";
        if("优秀".equals(enwrite)){
            write1 = "√";
        }
        else if("一般".equals(enwrite)){
            write2 = "√";
        } else{
            write3 = "√";
        }
        data.put("write1",write1);
        data.put("write2",write2);
        data.put("write3",write3);
        String elsela = request.getParameter("elsela");
        if(elsela!=null && elsela!=""){
            data.put("elsela",elsela.trim());
        }else{
            data.put("elsela","");
        }
        //如果为空,设置为 ""
        String speak4 = "";
        String speak5 = "";
        String speak6 = "";
        String read4 = "";
        String read5 = "";
        String read6 = "";
        String write4 = "";
        String write5 = "";
        String write6 = "";
        if (elsela!=null && elsela !=""){
            String enspeak2 = request.getParameter("enspeak2").trim();
            if("优秀".equals(enspeak2)){
                speak4 = "√";
            }
            else if("一般".equals(enspeak2)){
                speak5 = "√";
            } else{
                speak6 = "√";
            }
            String enread2 = request.getParameter("enread2").trim();
            if("优秀".equals(enread2)){
                read4 = "√";
            }
            else if("一般".equals(enread2)){
                read5 = "√";
            } else{
                read6 = "√";
            }
            String enwrite2 = request.getParameter("enwrite2").trim();
            if("优秀".equals(enwrite2)){
                write4 = "√";
            }
            else if("一般".equals(enwrite2)){
                write5 = "√";
            } else{
                write6 = "√";
            }
        }
        data.put("speak4",speak4);
        data.put("speak5",speak5);
        data.put("speak6",speak6);
        data.put("read4",read4);
        data.put("read5",read5);
        data.put("read6",read6);
        data.put("write4",write4);
        data.put("write5",write5);
        data.put("write6",write6);
        String enlevel = request.getParameter("enlevel").trim();
        data.put("enlevel",enlevel);
        String hobby = request.getParameter("hobby").trim();
        data.put("hobby",hobby);
        String health = request.getParameter("health").trim();
        data.put("health",health);

        String[] experience1 = request.getParameterValues("experience1");
        String company21 = "";
        String post21 =  "";
        String ym1 =  "";
        String reason1 = "";
        String witness1 = "";
        if (experience1!=null && experience1.length>0){
            company21 = experience1[0];
            post21 = experience1[1];
            ym1 = experience1[2];
            reason1 = experience1[3];
            witness1 = experience1[4];
        }
        data.put("company21",company21);
        data.put("post21",post21);
        data.put("ym1",ym1);
        data.put("reason1",reason1);
        data.put("witness1",witness1);

        String[] experience2 = request.getParameterValues("experience2");
        String company22 = "";
        String post22 =  "";
        String ym2 =  "";
        String reason2 = "";
        String witness2 = "";
        if (experience2!=null && experience2.length>0){
            company22 = experience2[0];
            post22 = experience2[1];
            ym2 = experience2[2];
            reason2 = experience2[3];
            witness2 = experience2[4];
        }
        data.put("company22",company22);
        data.put("post22",post22);
        data.put("ym2",ym2);
        data.put("reason2",reason2);
        data.put("witness2",witness2);

        String[] experience3 = request.getParameterValues("experience3");
        String company23 = "";
        String post23 =  "";
        String ym3 =  "";
        String reason3 = "";
        String witness3 = "";
        if (experience3!=null && experience3.length>0){
            company23 = experience3[0];
            post23 = experience3[1];
            ym3 = experience3[2];
            reason3 = experience3[3];
            witness3 = experience3[4];
        }
        data.put("company23",company23);
        data.put("post23",post23);
        data.put("ym3",ym3);
        data.put("reason3",reason3);
        data.put("witness3",witness3);

        String[] experience4 = request.getParameterValues("experience4");
        String company24 = "";
        String post24 =  "";
        String ym4 =  "";
        String reason4 = "";
        String witness4 = "";
        if (experience4!=null && experience4.length>0){
            company24 = experience4[0];
            post24 = experience4[1];
            ym4 = experience4[2];
            reason4 = experience4[3];
            witness4 = experience4[4];
        }
        data.put("company24",company24);
        data.put("post24",post24);
        data.put("ym4",ym4);
        data.put("reason4",reason4);
        data.put("witness4",witness4);
        String understand = request.getParameter("understand").trim();
        data.put("understand",understand);
        String[] sosconcat1 = request.getParameterValues("sosconcat1");
        String name6 = "";
        String relation6 =  "";
        String soslocation0 =  "";
        String phone6 = "";
        if (sosconcat1!=null && sosconcat1.length>0){
            name6 = sosconcat1[0];
            relation6 = sosconcat1[1];
            soslocation0 = sosconcat1[2];
            phone6 = sosconcat1[3];
        }
        data.put("name6",name6);
        data.put("relation6",relation6);
        data.put("soslocation0",soslocation0);
        data.put("phone6",phone6);

        String[] sosconcat2 = request.getParameterValues("sosconcat2");
        String name7 = "";
        String relation7 =  "";
        String soslocation1 =  "";
        String phone7 = "";
        if (sosconcat2!=null && sosconcat2.length>0){
            name7 = sosconcat2[0];
            relation7 = sosconcat2[1];
            soslocation1 = sosconcat2[2];
            phone7 = sosconcat2[3];
        }
        data.put("name7",name7);
        data.put("relation7",relation7);
        data.put("soslocation1",soslocation1);
        data.put("phone7",phone7);
        System.out.println(data);

        return data;
    }
}
