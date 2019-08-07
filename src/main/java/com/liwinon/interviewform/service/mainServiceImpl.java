package com.liwinon.interviewform.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
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
        String postDate0 = request.getParameter("postDate0").trim();
        data.put("postDate0",postDate0);
        String sex = request.getParameter("sex").trim();
        data.put("sex",sex);
        //出生日期
        String borndate = request.getParameter("date2").trim();
        data.put("borndate",borndate);
        String iheight = request.getParameter("iheight").trim();
        data.put("iheight",iheight);
        String nativePlace = request.getParameter("nativePlace").trim();
        data.put("nativePlace",nativePlace);
        String nation = request.getParameter("nation").trim();
        data.put("nation",nation);
        String faith = request.getParameter("faith");
        if (faith==null||faith==""){
            data.put("faith","无");
        }else{
            data.put("faith",faith.trim());
        }
        String education = request.getParameter("education").trim();
        data.put("education0",education);
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
        String[] family1 = request.getParameterValues("family1");
        String member1 = family1[0];
        String relation1 = family1[1];
        String phone2 = family1[2];
        String profession1 = family1[3];
        String company4 = family1[4];
        data.put("member1",member1);
        data.put("relation1",relation1);
        data.put("phone2",phone2);
        data.put("profession1",profession1);
        data.put("company4",company4);
        String[] family2 = request.getParameterValues("family2");
        String member2 = "";
        String relation2 = "";
        String phone3 = "";
        String profession2 = "";
        String company5 = "";
        if (family2!=null && family2.length>0){
            member2 = family2[0];
             relation2 = family2[1];
            phone3 = family2[2];
             profession2 = family2[3];
            company5 = family2[4];
        }
        data.put("member2",member2);
        data.put("relation2",relation2);
        data.put("phone3",phone3);
        data.put("profession2",profession2);
        data.put("company5",company5);

        String[] family3 = request.getParameterValues("family3");
        String member3 = "";
        String relation3 = "";
        String phone4 = "";
        String profession3 = "";
        String company6 = "";
        if (family3!=null && family3.length>0){
            member3 = family3[0];
             relation3 = family3[1];
            phone4 = family3[2];
             profession3 = family3[3];
            company6 = family3[4];
        }
        data.put("member3",member3);
        data.put("relation3",relation3);
        data.put("phone4",phone4);
        data.put("profession3",profession3);
        data.put("company6",company6);

        String[] friend1 = request.getParameterValues("friend1");
        String name4 = "";
        String department1 =  "";
        String position1 =  "";
        String phone5 = "";
        String relation4 = "";
        if (friend1!=null && friend1.length>0){
             name4 = friend1[0];
             department1 = friend1[1];
             position1 = friend1[2];
            phone5 = friend1[3];
             relation4 = friend1[4];
        }
        data.put("name4",name4);
        data.put("department1",department1);
        data.put("position1",position1);
        data.put("phone5",phone5);
        data.put("relation4",relation4);

        String[] friend2 = request.getParameterValues("friend2");
        String name5 = "";
        String department2 =  "";
        String position2 =  "";
        String phone6 = "";
        String relation5 = "";
        if (friend2!=null && friend2.length>0){
             name5 = friend2[0];
             department2 = friend2[1];
             position2 = friend2[2];
            phone6 = friend2[3];
             relation5 = friend2[4];

        }
        data.put("name5",name5);
        data.put("department2",department2);
        data.put("position2",position2);
        data.put("phone6",phone6);
        data.put("relation5",relation5);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//接收格式
        SimpleDateFormat value = new SimpleDateFormat("yyyy/MM");//设置格式
        /*开始处理教育经历*/
        String school1 = request.getParameter("school1");
        if(school1!=null && school1!=""){
            data.put("school1",school1.trim());
        }else{
            data.put("school1","");
        }
        String scdate11 = request.getParameter("scdate11");
        String date2 = "";
        if(scdate11!=null && scdate11!=""){
            try {
                date2  = value.format(sdf.parse(scdate11));
                String scdate12 = request.getParameter("scdate12");
                date2 = date2 +"-" + value.format(sdf.parse(scdate12));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date2",date2);
        String major1 = request.getParameter("major1");
        if(major1!=null && major1!=""){
            data.put("major1",major1.trim());
        }else{
            data.put("major1","");
        }
        String education1 = request.getParameter("education1");
        if(education1!=null && education1!=""){
            data.put("education1",education1.trim());
        }else{
            data.put("education1","");
        }
        String aDegree1 = request.getParameter("aDegree1");
        if(aDegree1!=null && aDegree1!=""){
            data.put("aDegree1",aDegree1.trim());
        }else{
            data.put("aDegree1","");
        }
        String school2 = request.getParameter("school2");
        if(school2!=null && school2!=""){
            data.put("school2",school2.trim());
        }else{
            data.put("school2","");
        }
        String scdate21 = request.getParameter("scdate21");
        String date3 = "";
        if(scdate21!=null && scdate21!=""){
            try {
                date3  = value.format(sdf.parse(scdate21));
                String scdate22 = request.getParameter("scdate22");
                date3 = date3 +"-" + value.format(sdf.parse(scdate22));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date3",date3);
        String major2 = request.getParameter("major2");
        if(major2!=null && major2!=""){
            data.put("major2",major2.trim());
        }else{
            data.put("major2","");
        }
        String education2 = request.getParameter("education2");
        if(education2!=null && education2!=""){
            data.put("education2",education2.trim());
        }else{
            data.put("education2","");
        }
        String aDegree2 = request.getParameter("aDegree2");
        if(aDegree2!=null && aDegree2!=""){
            data.put("aDegree2",aDegree2.trim());
        }else{
            data.put("aDegree2","");
        }
        String school3 = request.getParameter("school3");
        if(school3!=null && school3!=""){
            data.put("school3",school3.trim());
        }else{
            data.put("school3","");
        }
        String scdate31 = request.getParameter("scdate31");
        String date4 = "";
        if(scdate31!=null && scdate31!=""){
            try {
                date4  = value.format(sdf.parse(scdate31));
                String scdate32 = request.getParameter("scdate32");
                date4 = date4 +"-" + value.format(sdf.parse(scdate32));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date4",date4);
        String major3 = request.getParameter("major3");
        if(major3!=null && major3!=""){
            data.put("major3",major3.trim());
        }else{
            data.put("major3","");
        }
        String education3 = request.getParameter("education3");
        if(education3!=null && education3!=""){
            data.put("education3",education3.trim());
        }else{
            data.put("education3","");
        }
        String aDegree3 = request.getParameter("aDegree3");
        if(aDegree3!=null && aDegree3!=""){
            data.put("aDegree3",aDegree3.trim());
        }else{
            data.put("aDegree3","");
        }
        /*结束 教育经历*/
        /*开始 培训经历*/
        String train1 = request.getParameter("train1");
        if(train1!=null && train1!=""){
            data.put("train1",train1.trim());
        }else{
            data.put("train1","");
        }
        String tdate1 = request.getParameter("tdate1");
        String date8 = "";
        if(tdate1!=null && tdate1!=""){
            try {
                date8  = value.format(sdf.parse(tdate1));
                String tdate2 = request.getParameter("tdate2");
                date8 = date8 +"-" + value.format(sdf.parse(tdate2));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date8",date8);
        String content1 = request.getParameter("content1");
        if(content1!=null && content1!=""){
            data.put("content1",content1.trim());
        }else{
            data.put("content1","");
        }
        String course1 = request.getParameter("course1");
        if(course1!=null && course1!=""){
            data.put("course1",course1.trim());
        }else{
            data.put("course1","");
        }
        String train2 = request.getParameter("train2");
        if(train2!=null && train2!=""){
            data.put("train2",train2.trim());
        }else{
            data.put("train2","");
        }
        String tdate3 = request.getParameter("tdate3");
        String date9 = "";
        if(tdate3!=null && tdate3!=""){
            try {
                date9  = value.format(sdf.parse(tdate3));
                String tdate4 = request.getParameter("tdate4");
                date9 = date9 +"-" + value.format(sdf.parse(tdate4));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date9",date9);
        String course2 = request.getParameter("course2");
        if(course2!=null && course2!=""){
            data.put("course2",course2.trim());
        }else{
            data.put("course2","");
        }
        String content2 = request.getParameter("content2");
        if(content2!=null && content2!=""){
            data.put("content2",content2.trim());
        }else{
            data.put("content2","");
        }
        String train3 = request.getParameter("train3");
        if(train3!=null && train3!=""){
            data.put("train3",train3.trim());
        }else{
            data.put("train3","");
        }
        String tdate5 = request.getParameter("tdate5");
        String dates1 = "";
        if(tdate5!=null && tdate5!=""){
            try {
                dates1  = value.format(sdf.parse(tdate5));
                String tdate6 = request.getParameter("tdate6");
                dates1 = dates1 +"-" + value.format(sdf.parse(tdate6));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("dates1",dates1);
        String course3 = request.getParameter("course3");
        if(course3!=null && course3!=""){
            data.put("course3",course3.trim());
        }else{
            data.put("course3","");
        }
        String content3 = request.getParameter("content3");
        if(content3!=null && content3!=""){
            data.put("content3",content3.trim());
        }else{
            data.put("content3","");
        }
        String enlevel = request.getParameter("enlevel");
        if(enlevel!=null && enlevel!=""){
            data.put("enlevel",enlevel.trim());
        }else{
            data.put("enlevel","");
        }
        String otherLevel = request.getParameter("otherLevel");
        if(otherLevel!=null && otherLevel!=""){
            data.put("otherLevel",otherLevel.trim());
        }else{
            data.put("otherLevel","");
        }
        String hobby = request.getParameter("hobby").trim();
        if(hobby!=null && hobby!=""){
            data.put("hobby",hobby.trim());
        }else{
            data.put("hobby","");
        }
        String health = request.getParameter("health").trim();
        if(health!=null && health!=""){
            data.put("health",health.trim());
        }else{
            data.put("health","");
        }

        /*开始 工作经历*/
        String[] experience1 = request.getParameterValues("experience1");
        String company1 = "";
        String post1 =  "";
        String date5 = "";
        String reason1 = "";
        String witness1 = "";
        if (experience1!=null && experience1.length>0){
            company1 = experience1[0];
            post1 = experience1[1];
            date5 = experience1[2];
            reason1 = experience1[3];
            witness1 = experience1[4];
        }
        data.put("company1",company1);
        data.put("post1",post1);
        data.put("date5",date5);
        data.put("reason1",reason1);
        data.put("witness1",witness1);

        String[] experience2 = request.getParameterValues("experience2");
        String company2 = "";
        String post2 =  "";
        String date6 =  "";
        String reason2 = "";
        String witness2 = "";
        if (experience2!=null && experience2.length>0){
            company2 = experience2[0];
            post2 = experience2[1];
            date6 = experience2[2];
            reason2 = experience2[3];
            witness2 = experience2[4];
        }
        data.put("company2",company2);
        data.put("post2",post2);
        data.put("date6",date6);
        data.put("reason2",reason2);
        data.put("witness2",witness2);

        String[] experience3 = request.getParameterValues("experience3");
        String company3 = "";
        String post3 =  "";
        String date7 =  "";
        String reason3 = "";
        String witness3 = "";
        if (experience3!=null && experience3.length>0){
            company3 = experience3[0];
            post3 = experience3[1];
            date7 = experience3[2];
            reason3 = experience3[3];
            witness3 = experience3[4];
        }
        data.put("company3",company3);
        data.put("post3",post3);
        data.put("date7",date7);
        data.put("reason3",reason3);
        data.put("witness3",witness3);
        /*结束 工作经历*/
        /*处理紧急联系人*/
        String sosName = request.getParameter("sosName").trim();
        String sosPhone = request.getParameter("sosPhone").trim();
        data.put("name1",sosName);
        data.put("phone1",sosPhone);
        /*结束*/
        System.out.println(data);

        return data;
    }
}
