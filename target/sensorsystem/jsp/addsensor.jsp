<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/27
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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

    <style>

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
                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/jsp/login.jsp" class="pure-menu-link">用户切换</a></li>

                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/jsp/addunit.jsp" class="pure-menu-link">添加单位</a></li>

                <li class="pure-menu-item"><a href="<%=request.getContextPath()%>/sensor/sensorquery" class="pure-menu-link">我的传感器</a></li>

                <li class="pure-menu-item"><a href="http://localhost:8080/sensor/html/aboutus.html" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>添加传感器</h1>

        </div>

        <div class="content">
            <legend>
                <br><br>
                <form class="pure-form pure-form-stacked" method="post" action="<%=request.getContextPath()%>/sensor/addsensor">
                    <fieldset>
                        <div class="pure-g">
                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">传感器编号</label>
                                <input id="sid" name="sid" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">名字</label>
                                <input id="sname" name="sname" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">昵称</label>
                                <input id="nickname" name="nickname" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">厂商</label>
                                <input id="manufacturer" name="manufacturer" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">国家</label>
                                <input id="area" name="area" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">型号</label>
                                <input id="partnumber" name="partnumber" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">分组</label>
                                <input id="groupname" name="groupname" class="pure-u-23-24" type="text">
                            </div>

                            <div class="pure-u-1 pure-u-md-1-3">
                                <label for="email">单位</label>
                                <select>
                                    <c:forEach items="${unit}" var="item">
                                        <option value="${item.unit}">${item.unit}</option>
                                    </c:forEach>
                                </select>
                                <input id="unit" name="unit" class="pure-u-23-24" type="text">
                            </div>

                        </div>


                        <button type="submit" class="pure-button pure-button-primary">添加</button>
                    </fieldset>
                </form>
                <br><br>
            </legend>


        </div>
    </div>
</div>




<script src="/js/ui.js"></script>

</body>
</html>
