var send = false
var send2 = false
/*发送数据*/
var submittimes = 0;
function put() {
    var data = $("#data").serialize();
    console.log(data)
   if (submittimes>=2){
    // if (submittimes>=999){
        alert("请勿重复提交!")
    }
    else if (send==false || send2 ==false){
        checkInput()
        //alert("请完成必填内容!")
    }else{
        $.ajax({
            url:"/inform/save",
            data: data,
            type: "post",
            success:function (res) {
                console.log(res)
                if("ok"==res){
                    alert("提交成功!")
                    submittimes++;
                }
            },
            error:function (err) {
                console.log(err)
                alert("提交失败!")
            }
        })
    }
}

function inputValue(obj){
  //console.log(obj)
    //获取数据类型
    var type = obj.parentElement.getAttribute("name");
    var content = prompt("请输入")
    if (content==null){
        content = ""
    }
    obj.innerHTML=content+'<input name ="'+type+'" type=hidden value="'+content+'">';
}
var friend = 2 ;
var family = 3;
function addMember(size) {
        if(size == 3){ //家庭
            var count = document.getElementById("family").getElementsByTagName("tr").length;
            if(count>=size){
                alert("最多填写三名.")
            }else {
                document.getElementById("family").insertAdjacentHTML("beforeend", '<tr name="family'+family+'">\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                </tr>');
                family++;
            }
        }
        if(size == 2) { //盆友
            count = document.getElementById("friend").getElementsByTagName("tr").length;
            if (count >= size) {
                alert("最多填写两名.")
            } else {
                document.getElementById("friend").insertAdjacentHTML("beforeend", '<tr name="friend'+friend+'">\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                </tr>');
                friend++;
            }
        }
}
var studytimes = 2;
var traintimes = 2;
var traincertificate = 6;

function addStudy(size) {
    if(size==4){  //学校
        var count = document.getElementById("study").getElementsByTagName("block").length;
        if(count>=size){
            alert("最多填写四个.")
        }else {
            document.getElementById("study").insertAdjacentHTML("beforeend", '<block>\n' +
                '                                                学校名称 <input name="school'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    <div class="col-xs-6 mydate " >\n' +
                '                                                由 <input name="scdate'+studytimes+'1" type="date" class="form-control" placeholder="">\n' +
                '                                                    </div>\n' +
                '                                                    <div class="col-xs-6 mydate">\n' +
                '                                                至 <input name="scdate'+studytimes+'2" type="date" class="form-control" placeholder="">\n' +
                '                                                    </div>\n' +
                '                                                专业 <input name="major'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                获得证书 <input name="certificate'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                </block>')
            studytimes ++;
        }
    }
    if(size==3){  //培训
        var count = document.getElementById("train").getElementsByTagName("block").length;
        if(count>=size){
            alert("最多填写三个.")
        }else {
            document.getElementById("train").insertAdjacentHTML("beforeend", ' <block>\n' +
                '                                                    培训机构 <input name="training'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    培训时间 <input name="time'+traintimes+'" type="text" class="form-control" placeholder="X个月">\n' +
                '                                                    培训课程 <input name="course'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    获得证书 <input name="certificate'+traincertificate+'" type="text" class="form-control" placeholder="">\n' +
                '                                                </block>');
            traintimes ++;
            traincertificate ++;
        }
    }
}

var exp = 2;
function addExp(size){  //添加工作简历
    var count = document.getElementById("experience").getElementsByTagName("tr").length;
    if(count>=size){
        alert("最多填写四段经历.")
    }else {
        document.getElementById("experience").insertAdjacentHTML("beforeend", '<tr name="experience'+exp+'">\n' +
            '                                                        <td onclick="inputValue(this)">请点击<input name="experience'+exp+'" type="hidden" value=""></td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击<input name="experience'+exp+'" type="hidden" value=""></td>\n' +
            '                                                        <td onclick="inputValue(this)">1999/06-1999/07<input name="experience'+exp+'" type="hidden" value=""></td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击<input name="experience'+exp+'" type="hidden" value=""></td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击<input name="experience'+exp+'" type="hidden" value=""></td>\n' +
            '                                                    </tr>');
        exp++
    }
}

//全变量,当前页数.
var page = 1;   //1 代表第一页,2代表第二页,3代表第三页   +1  下一步   -1后退

//移动到顶部
function toNext() {
    document.body.scrollTop = document.documentElement.scrollTop = 0;
    // page++;
    checkInput()
}
/* 检查填写的内容*/
var right = false;
var sos = false;
var exps = false;
function checkContent(selector){
    $(selector).each(function(){
        var b = selector;
        var a= $(this).children()
        if (a.context.innerText.indexOf("请点击")!=-1){  //存在  请点击
            if (selector.indexOf("family")!=-1){   //且是family
                right = false;//没填写完整
            }else if (selector.indexOf("sos")!=-1){
                sos = false ;
            }else if (selector.indexOf("experience")!=-1){
                exps = false;
            }

        }else {   //完整
            if (selector.indexOf("family")!=-1){   //且是family
                right = true;//填写完整
            }else if (selector.indexOf("sos")!=-1){
                sos = true ;
            }else if (selector.indexOf("experience")!=-1){
                exps = true;
            }
        }
    })
}
//检查用户输入
function checkInput(){
        $("#title").children().each(function () {
            var type = $(this)
            console.log("id:"+type.context.id)
            var id = type.context.id;
            var boolean = id=="jin"
            if(id=="jin"){
                console.log(type.context.className)
                if(type.context.className=="active"){  //选中的是这个元素
                    for(i=1 ; i<=2 ;i++){
                        checkContent("#family"+i);
                        console.log(right)
                        if(right==true){ //填写完整
                            continue
                        }
                        else{  //存在 请点击字符 未填写完整
                            alert("请填写完整家庭成员信息,至少两位.")
                            setTimeout(function () {
                                $("#back").click()
                            },100)
                            break
                        }
                    }
                }
            }else if (id=="jiny"){
                if(type.context.className=="active") {//选中的是这个元素
                    checkContent("#sos1")
                    if(sos==true){ //填写完整
                        send = true
                    }
                    else if (sos==false) {  //存在 请点击字符 未填写完整
                        send = false
                        alert("请填写紧急联系人,至少一位!")
                    }
                    checkContent("#experience1")
                    if(exps==true){ //填写完整
                        send2 = true
                    }
                    else if (exps==false) {  //存在 请点击字符 未填写完整
                        send2 = false
                        alert("请填写工作经历,至少一段!")
                    }
                }
            }

        })

}



