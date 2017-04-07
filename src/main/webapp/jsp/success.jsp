<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/20
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>登录成功、数据查询</title>

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

                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/jsp/login.jsp" class="pure-menu-link">切换用户</a></li>

                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.html" class="pure-menu-link">关于我们</a></li>

            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>您的传感器所有数据</h1>
            <h2>添加新的传感器<a href="<%=request.getContextPath()%>/jsp/addsensor.jsp">点我</a></h2>
        </div>

        <div class="content">
            <br/><br/>
            <div id="biaoge">
                <table class="pure-table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Date</th>
                        <th>Time</th>
                        <th>Data</th>
                        <th>Unit</th>
                    </tr>
                    </thead>

                    <tbody>

                        <c:forEach var="s" items="${sensordata}">
                            <tr class="pure-table-odd">
                                <td>${s.id}</td>
                                <td>${s.name}</td>
                                <td>${s.date}</td>
                                <td>${s.time}</td>
                                <td>${s.data}</td>
                                <td>${s.unit}</td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>


<script src="/js/ui.js"></script>

</body>
</html>
