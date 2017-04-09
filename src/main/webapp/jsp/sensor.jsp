<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/27
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>Responsive Side Menu &ndash; Layout Examples &ndash; Pure</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.2/build/pure-min.css" integrity="sha384-" crossorigin="anonymous">


    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../css/layouts/side-menu-old-ie.css">
    <![endif]-->
    <!--[if gt IE 8]><!-->
    <link rel="stylesheet" href="../css/layouts/side-menu.css">
    <!--<![endif]-->

    <style>
        .content{
            text-align:center;
        }

        #biaoge table{
            margin:0px auto;
        }

        .pure-menu-item {
            height: auto;
        }
    </style>

</head>
<body>
<%--显示传感器列表，并在每行的最后加上“绑定”按钮，将用户登陆的id与这个传感器的sid一起insert进sensormatch表--%>
<div id="layout">
    <!-- Menu toggle -->
    <a href="#menu" id="menuLink" class="menu-link">
        <!-- Hamburger icon -->
        <span></span>
    </a>

    <div id="menu">
        <div class="pure-menu">
            <a class="pure-menu-heading" href="#">管理系统</a>

            <ul class="pure-menu-list">
                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/jsp/login.jsp" class="pure-menu-link">用户切换</a></li>


                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.jsp" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>您的所有传感器</h1>
            <%--<h2>添加修改传感器<a href="#">点我</a></h2>--%>
        </div>

        <div class="content">
            <br/><br/>
            <div id="biaoge">
                <table class="pure-table">
                    <thead>
                    <tr>
                        <th>名称</th>
                        <th>昵称</th>
                        <th>厂商</th>
                        <th>国家</th>
                        <th>型号</th>
                        <th>组别</th>
                        <th>操作</th>
                        <th>操作</th>
                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach var="s" items="${sensors}">
                        <tr class="pure-table-odd">
                            <td>${s.sname}</td>
                            <td>${s.nickname}</td>
                            <td>${s.manufacturer}</td>
                            <td>${s.area}</td>
                            <td>${s.partnumber}</td>
                            <td>${s.groupname}</td>
                            <td><button onclick="deleteSensor(${s.sid})">解绑</button></td>
                            <td><a href="<%=request.getContextPath()%>/sensor/dataquery?sid=${s.sid}">数据详细</a></td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>


          <%--  小组查询--%>
            <form class="pure-form pure-form-stacked" method="post" action="<%=request.getContextPath()%>/sensor/sensorquerybygroup">
                <fieldset>
                    <div class="pure-g">
                        <div class="pure-u-1 pure-u-md-1-3">
                            <label for="id">按小组查询</label>
                            <input id="id" name="groupname" class="pure-u-23-24" type="text" required>
                        </div>
                    </div>

                    <button type="submit" class="pure-button pure-button-primary">查询</button>
                </fieldset>
            </form>




        </div>
    </div>
</div>


<script src="/js/ui.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script>
    function deleteSensor(sid){
        $.ajax({
            type: "get",
            dataType: "html",
            url: '<%=request.getContextPath()%>/match/deletematch?sid='+sid,
            success: function (data) {
                location.href = "<%=request.getContextPath()%>/sensor/sensorquery";
            },
            error:function(data){
                alert(false)
            }
        });
    }
</script>
</body>
</html>




