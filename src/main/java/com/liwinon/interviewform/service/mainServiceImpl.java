package com.liwinon.interviewform.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class mainServiceImpl implements mainService {

    @Override
    public String saveinfo(HttpServletRequest request) {
        Map<String,String> data = new HashMap<>();
        String iname = request.getParameter("iname").trim();
        data.put("iname",iname);
        String phone = request.getParameter("phone").trim();
        data.put("phone",phone);
        String post = request.getParameter("post").trim();
        data.put("post",post);
        String date1 = request.getParameter("date1").trim();
        String[] ds = date1.split("-");
        String yy = ds[0];
        String MM = ds[1];
        String dd = ds[2];
        data.put("yy",yy);
        data.put("MM",MM);
        data.put("dd",dd);
        String salary = request.getParameter("salary").trim();
        data.put("salary",salary);
        String sex = request.getParameter("sex").trim();
        data.put("sex",sex);
        String date2 = request.getParameter("date2").trim();
        String[] ds2 = date2.split("-");
        String y2 = ds2[0];
        String M2 = ds2[1];
        String d2 = ds2[2];
        data.put("y2",y2);
        data.put("M2",M2);
        data.put("d2",d2);
        String height = request.getParameter("height").trim();
        data.put("height",height);
        String nativePlace = request.getParameter("nativePlace").trim();
        data.put("nativePlace",nativePlace);
        String nation = request.getParameter("nation").trim();
        data.put("nation",nation);
        String faith = request.getParameter("faith").trim();
        data.put("faith",faith);
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
        data.put("email",email);
        String[] family1 = request.getParameterValues("family1");
        String name1 = family1[0];
        String relation1 = family1[1];
        String age1 = family1[2];
        String profession1 = family1[3];
        String company1 = family1[4];
        String phone1 = family1[5];
        data.put("name1",name1);
        data.put("relation1",relation1);
        data.put("age1",age1);
        data.put("profession1",profession1);
        data.put("company1",company1);
        data.put("phone1",phone1);
        String[] family2 = request.getParameterValues("family2");
        if (family2!=null && family2.length>0){
            String name2 = family2[0];
            String relation2 = family2[1];
            String age2 = family2[2];
            String profession2 = family2[3];
            String company2 = family2[4];
            String phone2 = family2[5];
            data.put("name2",name2);
            data.put("relation2",relation2);
            data.put("age2",age2);
            data.put("profession2",profession2);
            data.put("company2",company2);
            data.put("phone2",phone2);
        }
        String[] family3 = request.getParameterValues("family3");
        String[] friend1 = request.getParameterValues("friend1");
        String[] friend2 = request.getParameterValues("friend2");
        String school1 = request.getParameter("school1").trim();
        String scdate11 = request.getParameter("scdate11").trim();
        String scdate12 = request.getParameter("scdate12").trim();
        String major1 = request.getParameter("major1").trim();
        String certificate1 = request.getParameter("certificate1").trim();
        String school2 = request.getParameter("school2").trim();
        String scdate21 = request.getParameter("scdate21").trim();
        String scdate22 = request.getParameter("scdate22").trim();
        String major2 = request.getParameter("major1").trim();
        String certificate2 = request.getParameter("certificate2").trim();
        String school3 = request.getParameter("school3").trim();
        String scdate31 = request.getParameter("scdate31").trim();
        String scdate32 = request.getParameter("scdate32").trim();
        String major3 = request.getParameter("major1").trim();
        String certificate3 = request.getParameter("certificate3").trim();
        String school4 = request.getParameter("school4").trim();
        String scdate41 = request.getParameter("scdate41").trim();
        String scdate42 = request.getParameter("scdate42").trim();
        String major4 = request.getParameter("major4").trim();
        String certificate4 = request.getParameter("certificate4").trim();
        String training1 = request.getParameter("training1").trim();
        String time1 = request.getParameter("time1").trim();
        String course1 = request.getParameter("course1").trim();
        String traincertificate1 = request.getParameter("traincertificate1").trim();
        String training2 = request.getParameter("training2").trim();
        String time2 = request.getParameter("time2").trim();
        String course2 = request.getParameter("course2").trim();
        String traincertificate2 = request.getParameter("traincertificate2").trim();
        String training3 = request.getParameter("training3").trim();
        String time3 = request.getParameter("time3").trim();
        String course3 = request.getParameter("course3").trim();
        String traincertificate3 = request.getParameter("traincertificate3").trim();
        String enspeak = request.getParameter("enspeak").trim();
        String enread = request.getParameter("enread").trim();
        String enwrite = request.getParameter("enwrite").trim();
        String elsela = request.getParameter("else").trim();
        String enspeak2 = request.getParameter("enspeak2").trim();
        String enread2 = request.getParameter("enread2").trim();
        String enwrite2 = request.getParameter("enwrite2").trim();
        String enlevel = request.getParameter("enlevel").trim();
        String hobby = request.getParameter("hobby").trim();
        String health = request.getParameter("health").trim();
        String[] experience1 = request.getParameterValues("experience1");
        String[] experience2 = request.getParameterValues("experience2");
        String[] experience3 = request.getParameterValues("experience3");
        String[] experience4 = request.getParameterValues("experience4");
        String understand = request.getParameter("understand").trim();
        String[] sosconcat1 = request.getParameterValues("sosconcat1");
        String[] sosconcat2 = request.getParameterValues("sosconcat2");



        return null;
    }
}
