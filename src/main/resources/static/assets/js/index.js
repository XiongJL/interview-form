/*发送数据*/
function put() {
    var data = $("#data").serialize();
    console.log(data)
    $.ajax({
        url:"/inform/save",
        data: data,
        type: "post",
        success:function (res) {
            console.log(res)
        },
        error:function (err) {
            console.log(err)
        }
    })
}

function inputValue(obj){
  //console.log(obj)
    //获取数据类型
    var type = obj.parentElement.getAttribute("name");
    var content = prompt("请输入")
    obj.innerHTML=content+'<input name ="'+type+'" type=hidden value="'+content+'">';
}
var friend = 2 ;
var family = 2;
function addMember(size) {
        if(size == 3){ //家庭
            var count = document.getElementById("family").getElementsByTagName("tr").length;
            if(count>=size){
                alert("最多填写三名.")
            }else {
                document.getElementById("family").insertAdjacentHTML("beforeend", '<tr name="family'+family+'">\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
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
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击</td>\n' +
                    '                                                </tr>');
                friend++;
            }
        }
}
var studytimes = 2;
var traintimes = 2;

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
                '                                                    获得证书 <input name="traincertificate'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                </block>');
            traintimes ++;
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
            '                                                        <td onclick="inputValue(this)">请点击</td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击</td>\n' +
            '                                                        <td onclick="inputValue(this)">1999/06-1999/07</td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击</td>\n' +
            '                                                        <td onclick="inputValue(this)">请点击</td>\n' +
            '                                                    </tr>');
        exp++
    }
}