<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/4/10
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A layout example with a side menu that hides on mobile, just like the Pure website.">
    <title>新单位</title>

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
                <li class="pure-menu-item"><a href="<%=request.getContextPath()%>/sensor/sensorquery" class="pure-menu-link">我的传感器</a></li>
                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.jsp" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>您的所有新单位</h1>
            <h2>添加新单位<a href="http://localhost:8080/sensor/jsp/addunit.jsp">点我</a></h2>
        </div>

        <div class="content">
            <br/><br/>
            <div id="biaoge">
                <table class="pure-table">
                    <thead>
                    <tr>
                        <th>名称</th>
                        <th>表示方式（国际单位）</th>

                    </tr>
                    </thead>

                    <tbody>

                    <c:forEach var="s" items="${unit}">
                        <tr class="pure-table-odd">
                            <td>${s.unit}</td>

                            <td>
                                ${s.rate}
                                * m<sup>${s.m}</sup>
                                * kg<sup>${s.kg}</sup>
                                * s<sup>${s.s}</sup>
                                * a<sup>${s.a}</sup>
                                * k<sup>${s.k}</sup>
                                * mol<sup>${s.mol}</sup>
                                * cd<sup>${s.cd}</sup>
                            </td>

                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>

        </div>
    </div>
</div>


<script src="/js/ui.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

</body>
</html>
