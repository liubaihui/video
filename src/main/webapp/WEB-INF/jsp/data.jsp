<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/19
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.css">
    <script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
    <title>后台</title>

    <style>
        .switch-btn {
            cursor: pointer;
            width: 45px;
            height: 28px;
            position: relative;
            border: 1px solid #dfdfdf;
            background-color: #fdfdfd;
            box-shadow: #dfdfdf 0 0 0 0 inset;
            border-radius: 15px;
            background-clip: content-box;
            display: inline-block;
            -webkit-appearance: none;
            user-select: none;
            outline: none;
        }
        .switch-btn:before {
            content: '';
            width: 25px;
            height: 25px;
            position: absolute;
            top: 0;
            left: 0;
            border-radius: 20px;
            background-color: #fff;
            box-shadow: 0 1px 3px rgba(0, 0, 0, .4);
        }
        .switch-btn:checked {
            border-color: #56b0d4;
            box-shadow: #56b0d4 0 0 0 16px inset;
            background-color: #56b0d4;
        }
        .switch-btn:checked:before {
            left: 18px;
        }
        .switch-btn.switch-btn-animbg {
            transition: background-color ease .4s;
        }
        .switch-btn.switch-btn-animbg:before {
            transition: left .3s;
        }
        .switch-btn.switch-btn-animbg:checked {
            box-shadow: #dfdfdf 0 0 0 0 inset;
            background-color: #56b0d4;
            transition: border-color .4s, background-color ease .4s;
        }
        .switch-btn.switch-btn-animbg:checked:before {
            transition: left .3s;
        }
    </style>
</head>
<body>

<%--&lt;%&ndash;修改&ndash;%&gt;--%>

<%--<div id="myModalUpdate" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">--%>
    <%--<div class="modal-header">--%>
        <%--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>--%>
        <%--<h5 id="myModalLabel">修改双色球参数数据</h5>--%>
    <%--</div>--%>
    <%--<div class="modal-body">--%>
        <%--<form class="form-horizontal" id="formUpdate">--%>
            <%--<input type="hidden" name="id" id="ballId">--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no1">参数1</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no1" placeholder="name" name="data1">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no2">参数2:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="number" id="no2" placeholder="phone" name="data2">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no3">参数3:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no3" placeholder="email" name="data3">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no4">参数4:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no4" placeholder="adress" name="data4">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no5">参数5:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no5" placeholder="adress" name="data5">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no6">参数6:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no6" placeholder="adress" name="data6">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="no7">参数7:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input type="text" id="no7" placeholder="adress" name="data7">--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--&lt;%&ndash;  <div class="control-group">--%>
                  <%--<div class="controls">--%>
                      <%--<label class="checkbox">--%>
                          <%--<input type="checkbox"> Remember me--%>
                      <%--</label>--%>
                      <%--<button type="submit" class="btn">Sign in</button>--%>
                  <%--</div>--%>
              <%--</div>&ndash;%&gt;--%>
        <%--</form>--%>
    <%--</div>--%>
    <%--<div class="modal-footer">--%>
        <%--<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>--%>
        <%--<button class="btn btn-primary" id="addUpdate" >修改</button>--%>
    <%--</div>--%>
<%--</div>--%>






<div class="modal fade" tabindex="-1" role="dialog" id="myModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="text-align: center;">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">双色球参数数据修改</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="formUpdate">
                    <input type="hidden" name="id" id="ballId">

                    <div class="control-group">
                        <label class="control-label" for="no1">数字1:</label>
                        <span>
                            <input type="text" id="no1" placeholder="name" name="no1">
                       </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no2">数字2:</label>
                       <span>
                            <input type="text" id="no2" placeholder="phone" name="no2">
                        </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no3">数字3:</label>
                        <span>
                            <input type="text" id="no3" placeholder="email" name="no3">
                        </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no4">数字4:</label>
                        <span>
                            <input type="text" id="no4" placeholder="adress" name="no4">
                       </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no5">数字5:</label>
                       <span>
                            <input type="text" id="no5" placeholder="adress" name="no5">
                        </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no6">数字6:</label>
                        <span>
                            <input type="text" id="no6" placeholder="adress" name="no6">
                       </span>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="no7">数字7:</label>
                        <span>
                            <input type="text" id="no7" placeholder="adress" name="no7">
                        </span>
                    </div>

                    <%--  <div class="control-group">
                          <div class="controls">
                              <label class="checkbox">
                                  <input type="checkbox"> Remember me
                              </label>
                              <button type="submit" class="btn">Sign in</button>
                          </div>
                      </div>--%>
                </form>



            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="addUpdate">修改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->







<div class="row" style="width: auto" align="center">

    <div>
        <h1></h1>

        <form class="form-inline" style="width: 522px;float: left;/* text-align: center; */margin-left: 198px">
            <div class="form-group">
                <label for="ballValue">双色球期数修改：</label>
                <input type="text" class="form-control" id="ballValue" placeholder="数字" name="ballValue">
            </div>

            <button type="button" class="btn btn-default" onclick="updateDate()">修改</button>
        </form>

        <form class="form-inline" style="margin-right: 490px;">
           <span>
                <label for="openTime">开奖时间：</label>
                <input type="datetime-local" class="form-control" id="openTime" placeholder="开奖时间">
           </span>

            <button type="button" class="btn btn-default" onclick="openPrice()">修改</button>
        </form>

        <div style="width: 500px; display: inline-block;margin-left: -505px;" >
        <form class="form-inline" style="margin-right: 352px;">
           <span>
               <label for="openTime">是否数据开放：</label>
                <input class="switch-btn switch-btn-animbg" type="checkbox" checked value="1" id="checkvalues"   >
           </span>
        </form>
        </div>

    </div>



    <div style="width: 500px; display: inline-block;" >

        <table class="table">

            <c:forEach var="numbers" items="${list}" begin="0" end="29">
                <tr>
                    <th>第${numbers.id}组</th>
                    <th>${numbers.no1}</th>
                    <th>${numbers.no2}</th>
                    <th>${numbers.no3}</th>
                    <th>${numbers.no4}</th>
                    <th>${numbers.no5}</th>
                    <th>${numbers.no6}</th>
                    <th>${numbers.no7}</th>
                        <%--<th><button class="btn btn-danger" type="button" id="deleteUser" onclick="deleteUser(${user.id})">删除</button>--%>
                    <th> <button class="btn btn-info" type="button" data-toggle="modal" data-target="#myModal" onclick="update('${numbers.id}','${numbers.no1}','${numbers.no2}','${numbers.no3}','${numbers.no4}','${numbers.no5}','${numbers.no6}','${numbers.no7}')">修改</button>
                        </th>
                </tr>
            </c:forEach>

        </table>

    </div>
    <div style="width: 500px; display: inline-block;">

        <table class="table">

            <c:forEach var="numbers" items="${list}" begin="30" end="60">
                <tr>
                    <th>第${numbers.id}组</th>
                    <th>${numbers.no1}</th>
                    <th>${numbers.no2}</th>
                    <th>${numbers.no3}</th>
                    <th>${numbers.no4}</th>
                    <th>${numbers.no5}</th>
                    <th>${numbers.no6}</th>
                    <th>${numbers.no7}</th>
                        <%--<th><button class="btn btn-danger" type="button" id="deleteUser" onclick="deleteUser(${user.id})">删除</button>--%>
                        <th><button class="btn btn-info" type="button" data-toggle="modal" data-target="#myModal" onclick="update('${numbers.id}','${numbers.no1}','${numbers.no2}','${numbers.no3}','${numbers.no4}','${numbers.no5}','${numbers.no6}','${numbers.no7}')">修改</button>
                        </th>
                </tr>
            </c:forEach>

        </table>

    </div>
</div>












</body>
<script>



    function update(id,no1,no2,no3,no4,no5,no6,no7){
        $("#ballId").val(id);
        $("#no1").val(no1);
        $("#no2").val(no2);
        $("#no3").val(no3);
        $("#no4").val(no4);
        $("#no5").val(no5);
        $("#no6").val(no6);
        $("#no7").val(no7);
        /* window.location.reload()*/
    }



    $("#addUpdate").click(function(){
        $.post("${pageContext.request.contextPath}/updateBall",$("#formUpdate").serialize(),function(data){
            if(data=="ok"){
                alert("修改成功");

            }else {
                alert("修改失败");
            }
            window.location.href="${pageContext.request.contextPath}/back/end";
        });
    })



    function updateDate(){
       var param= $("#ballValue").val()

        $.get("${pageContext.request.contextPath}/updateBalls?ballValues="+param, function(data){
            if (data=="ok"){
                alert("更新成功");
                window.location.href="${pageContext.request.contextPath}/back/end";
            }else if (data=="fails"){
                alert("更新删除");
                window.location.href="${pageContext.request.contextPath}/back/end";
            }
        });
    }



    function openPrice(){
        var param= $("#openTime").val()

        $.get("${pageContext.request.contextPath}/openPrice?priceDate="+param, function(data){
            if (data=="ok"){
                alert("更新成功");
                window.location.href="${pageContext.request.contextPath}/back/end";
            }else if (data=="fails"){
                alert("更新删除");
                window.location.href="${pageContext.request.contextPath}/back/end";
            }
        });
    }


    function checkboxOnclick(checkbox){
        alert(checkbox)

        if ( checkbox.checked == true){
            var statues=checkbox;
            $.get("${pageContext.request.contextPath}/listAll?priceDate="+statues, function(data){
                <%--if (data=="ok"){--%>
                <%--alert("更新成功");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}else if (data=="fails"){--%>
                <%--alert("更新删除");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}--%>
            });
        }else{
            var statues=checkbox;
            $.get("${pageContext.request.contextPath}/listAll?priceDate="+statues, function(data){
                <%--if (data=="ok"){--%>
                <%--alert("更新成功");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}else if (data=="fails"){--%>
                <%--alert("更新删除");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}--%>
            });


        }

//        var param= $("#checkvalues").val()
//        alert(param)



    }



    $("#checkvalues").click(function(){

        if($(this).prop("checked")){

            var statues=true;
            alert("数据开放成功")
            $.get("${pageContext.request.contextPath}/updateStatus?priceDate="+statues, function(data){

            });

        }else{
            var statues=false;
            alert("数据关闭成功")
            $.get("${pageContext.request.contextPath}/updateStatus?priceDate="+statues, function(data){
                <%--if (data=="ok"){--%>
                <%--alert("更新成功");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}else if (data=="fails"){--%>
                <%--alert("更新删除");--%>
                <%--window.location.href="${pageContext.request.contextPath}/back/end";--%>
                <%--}--%>
            });

        }

        });


</script>
</html>
