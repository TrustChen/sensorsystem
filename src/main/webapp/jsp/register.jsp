<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/3/20
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
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
                <li class="pure-menu-item"><a href="#" class="pure-menu-link">用户登录</a></li>
                <li class="pure-menu-item"><a href="#" class="pure-menu-link">设备绑定</a></li>

                <li class="pure-menu-item" class="menu-item-divided pure-menu-selected">
                    <a href="#" class="pure-menu-link">查看数据</a>
                </li>

                <li class="pure-menu-item"><a href="#" class="pure-menu-link">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div id="main">
        <div class="header">

            <h1>用户注册</h1>

        </div>

        <div class="content">
                <legend>
                    <br><br>
                    <form class="pure-form pure-form-stacked" method="post" action="<%=request.getContextPath()%>/users/register">
                        <fieldset>
                            <div class="pure-g">
                                <div class="pure-u-1 pure-u-md-1-3">
                                    <label for="id">账号</label>
                                    <input id="id" name="id" class="pure-u-23-24" type="text" required>
                                </div>

                                <div class="pure-u-1 pure-u-md-1-3">
                                    <label for="password">密码</label>
                                    <input id="password" name="password" class="pure-u-23-24" type="password" required>
                                </div>

                                <div class="pure-u-1 pure-u-md-1-3">
                                    <label for="email">用户名</label>
                                    <input id="email" name="name" class="pure-u-23-24" type="text" required>
                                </div>

                            </div>

                            <label for="terms" class="pure-checkbox">
                                <input id="terms" type="checkbox" required> I've read the terms and conditions
                            </label>

                            <button type="submit" class="pure-button pure-button-primary">Submit</button>
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