<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/11/19
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.css">
    <script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
    <title>双色球参选数据</title>
</head>
<body>
<style>
    .syls {
        line-height: 50px;
        vertical-align: middle;
        font-size: 20px;
        text-align: center;
        margin-right: 10px;
        color: #f54646;

        width: 40px;
        height: 50px;
        display: inline-block;
        background: url(https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/static/protocol/https/global/img/icons_5859e57.png) no-repeat 0 0;
        background-position: 0px -235px;
    }


    .riglt{
        line-height: 43px;
        vertical-align: middle;
        font-size: 20px;
        text-align: center;
        color: #f54646;

        width: 39px;
        height: 43px;
        display: inline-block;
        background: url(https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/static/protocol/https/global/img/icons_5859e57.png) no-repeat 0 0;
        background-position: -47px -238px;
        color: #39f;
    }
    table {
        border-spacing: 0;
        border-collapse: collapse;
        }


    *{margin:0; padding:0;}
    a{text-decoration: none;}
    img{max-width: 100%; height: auto;}
    .weixin-tip{display: none; position: fixed; left:0; top:0; bottom:0; background: rgba(0,0,0,0.8); filter:alpha(opacity=80);  height: 100%; width: 100%; z-index: 100;}
    .weixin-tip p{text-align: center; margin-top: 10%; padding:0 5%;}
</style>





<div class="row" style="width: auto" align="center">

    <div>

        <h3>双色球第${timeData}期内部数据</h3>
        <h4>开奖时间：${opentime}</h4>

    </div>

    <div style="width: 480px; display: inline-block;" >

        <table>

            <c:forEach var="numbers" items="${list}" begin="0" end="29">
                <tr>
                    <th class="syls">${numbers.no1}</th>
                    <th class="syls">${numbers.no2}</th>
                    <th class="syls">${numbers.no3}</th>
                    <th class="syls">${numbers.no4}</th>
                    <th class="syls">${numbers.no5}</th>
                    <th class="syls">${numbers.no6}</th>
                    <th class="riglt">${numbers.no7}</th>
                        <%--<th><button class="btn btn-danger" type="button" id="deleteUser" onclick="deleteUser(${user.id})">删除</button>--%>
                        <%--<button class="btn btn-info" type="button" data-toggle="modal" data-target="#myModalUpdate" onclick="update('${user.id}','${user.name}','${user.phone}','${user.email}','${user.address}')">修改</button>--%>
                        <%--</th>--%>
                </tr>
            </c:forEach>

        </table>

    </div>
    <div style="width: 480px; display: inline-block;">

        <table>

            <c:forEach var="numbers" items="${list}" begin="30" end="60">
                <tr>
                    <th class="syls">${numbers.no1}</th>
                    <th class="syls">${numbers.no2}</th>
                    <th class="syls">${numbers.no3}</th>
                    <th class="syls">${numbers.no4}</th>
                    <th class="syls">${numbers.no5}</th>
                    <th class="syls">${numbers.no6}</th>
                    <th class="riglt">${numbers.no7}</th>
                        <%--<th><button class="btn btn-danger" type="button" id="deleteUser" onclick="deleteUser(${user.id})">删除</button>--%>
                        <%--<button class="btn btn-info" type="button" data-toggle="modal" data-target="#myModalUpdate" onclick="update('${user.id}','${user.name}','${user.phone}','${user.email}','${user.address}')">修改</button>--%>
                        <%--</th>--%>
                </tr>
            </c:forEach>

        </table>

    </div>
</div>

<script>
    $(window).on("load",function(){

    })
</script>













</body>
</html>
