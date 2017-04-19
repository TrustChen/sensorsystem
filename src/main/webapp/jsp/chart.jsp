<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/4/9
  Time: 23:17
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
<script type="text/javascript" src="../js/d3.js"></script>
<script>
    var width  = 1300;
    var height = 500;

    var svg = d3.select("body").append("svg")
        .attr("width", width)
        .attr("height", height)
        .append("g")
        .attr("transform", "translate(0,0)");

    var padding = {top:10, right:0, bottom:50, left:200};
    var gdpmax = 47310;

    var datas = ${sensordatachart};
    var tempMin = d3.min(datas[0].temps, function (d) {
        return d[1];
    });
    var tempMax = d3.max(datas[0].temps, function (d) {
        return d[1];
    });
    var timeMin = d3.min(datas[0].temps, function(d){
        return d[0];
    });
    var timeMax = d3.max(datas[0].temps, function(d){
        return d[0];
    });

    var xScale = d3.scale.linear()
        .domain([timeMin,timeMax])
        .range([0,width-padding.left-padding.right]);
    var yScale = d3.scale.linear()
        .domain([0,tempMax*1.1])
        .range([height - padding.top - padding.bottom, 0]);

    var linePath = d3.svg.line()
        .x(function (d) {
            return xScale(d[0])})
        .y(function (d) {
            return yScale(d[1])
        });

    var colors = [d3.rgb(0,0,255), d3.rgb(0,255,0)];

    svg.selectAll("path")
        .data(datas)
        .enter()
        .append("path")
        .attr("transform","translate(" + padding.left+","+padding.top +")")
        .attr("d", function (d) {
            return linePath(d.temps);
        })
        .attr("fill", "none")
        .attr("stroke-width", 3)
        .attr("stroke", function (d, i) {
            return colors[i];
        });

    svg.selectAll("circle")
        .data(datas[0].temps)
        .enter()
        .append("circle")
        .attr("fill", "black")
        .attr("cx", function(d){
            return padding.left + xScale(d[0]);
        })
        .attr("cy",function (d) {
            return padding.top + yScale(d[1]);
        })
        .attr("r", 4);

    var xAxis = d3.svg.axis()
        .scale(xScale)
        .tickFormat(d3.format("d"))
        .orient("bottom");

    var yAxis = d3.svg.axis()
        .scale(yScale)
        .orient("left");

    svg.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(" + padding.left + "," +
            (height - padding.bottom) + ")")
        .call(xAxis);

    svg.append("g")
        .attr("class", "y axis")
        .attr("transform", "translate(" + padding.left + "," + padding.top + ")")
        .call(yAxis);


</script>
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
            <h2>添加新的传感器<a href="<%=request.getContextPath()%>/sensor/add">点我</a></h2>
        </div>

        <div class="content">
            <br/><br/>


            <%--d3动态显示数据库数据开始--%>

            <%--d3动态显示数据库数据结束--%>

        </div>
    </div>
</div>


<script src="/js/ui.js"></script>

</body>
</html>
