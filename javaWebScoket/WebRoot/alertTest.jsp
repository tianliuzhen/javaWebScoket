<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'alertTest.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="view">

    </div>
  </body>
</html>
<script type="text/javascript">
        //先检验能不能运行起来，能不能连上，自动推送数据，先不做数据显示
        //客户端就会与服务器进行连接
        var webSocket = new WebSocket("ws://localhost:8080/javaWebScoket/websocketAlert");

        //这里只是调试用
        //连接失败时回调
        webSocket.onerror = function (event) {
            makeDataOnWeb("error");
        };

        //这里只是调试用
        //连接成功时回调，真的会执行括号中的代码！
        webSocket.onopen = function (event) {
            makeDataOnWeb("conn success");
        };
 webSocket.onmessage = function (event) {
            makeDataOnWeb(event.data);

        };

        //这里只是调试用
        webSocket.onclose = function (event) {
            makeDataOnWeb("conn close");
        };

        function makeDataOnWeb(data) {
            var a = data;
            var divNode = document.getElementById("view");
            var liNode = document.createElement("li");
            liNode.innerHTML = a;
            divNode.appendChild(liNode);
            //            divNode.insertBefore(liNode, divNode.children[0]);
            //不能用insertAfter，好像不是这么用的

            //            var divNode = document.getElementById("view");
//            var trNode = document.createElement("tr");
//            var td1 = document.createElement("td");
//            var td2 = document.createElement("td");
//            var td3 = document.createElement("td");
//            td1.innerHTML = a;
//            td2.innerHTML = a;
//            td3.innerHTML = a;
//            trNode.appendChild(td1)
//            trNode.appendChild(td2)
//            trNode.appendChild(td3)
            //            var head = document.getElementById("head");

//            document.write(a+"<br>");//直接写
//            document.getElementsById("a").innerHTML="fadfadfa";//不输出任何内容

        };

    </script>