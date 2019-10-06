<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'map.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=R1yasWrMtFbo2hEnyu31aokZSXGcNshP"></script>
  <script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript">
            function initMap(){
                createMap();//创建地图
                setMapEvent();//设置地图事件
            }
            //创建地图函数：
            function createMap(){
                var map = new BMap.Map("BaiduDitu");//在百度地图容器中创建一个地图
               // map.centerAndZoom('厦门',11);//设定地图的中心点和坐标并将地图显示在地图容器中
             
                var point = new BMap.Point(118.100495,24.443122);//设置中心点坐标--固定的位置--7号线大郊亭--金海国际
             //设置地图级别（1-18）
        map.centerAndZoom(point,16);
        
        //单独设定图标的样式
var icon = new BMap.Icon('http://wx.58haha.cn/1.png', new BMap.Size(20, 32), {
  anchor: new BMap.Size(10, 30)
});
//创建一个图像标注实例。point参数指定了图像标注所在的地理位置
var mkr = new BMap.Marker(new BMap.Point(118.100495,24.443122), {
icon: icon
});
//将覆盖物添加到地图中
map.addOverlay(mkr);
//将地图的中心点更改为给定的点
map.panTo(118.100495,24.443122);
        
        
       window.map = map;//将map变量存储在全局
            }
            //地图事件设置函数：
            function setMapEvent(){
                map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
                map.enableScrollWheelZoom();//启用地图滚轮放大缩小
                map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
                map.enableKeyboard();//启用键盘上下左右键移动地图
            }
            $(function(){
                initMap();//创建和初始化地图
                createSearch();
                createAutocomlete();
                $("#s_p_search_btn").click(function () {
                    searchPlace($("#searchplace").val());
                });
            });
            function createSearch() {
                var map = window.map;
                var local = new BMap.LocalSearch(map,
                    {
                        renderOptions: { map: map, panel: "searchlist" }
                    });
                window.local = local;
            }
            //搜索
            function searchPlace(value) {
                window.local.search(value);
            }
            function createAutocomlete() {
                var map = window.map;
                var ac = new BMap.Autocomplete(    //建立一个自动完成的对象
                    {
                        "input": "searchplace",
                        "location": map
                    });
                ac.addEventListener("onconfirm", function (e) {    //鼠标点击下拉列表后的事件
                    var _value = e.item.value;
                    var addr =_value.business+ _value.province + _value.city + _value.district + _value.street + _value.streetNumber ;
                    searchPlace(addr);
                });
            }
        </script>
  </head>
  
 <body class="">
     <div class="Ditumap">  
        <div style="margin-bottom:10px;">
            <input id="searchplace" style="width: 550px;" class="easyui-textbox-simple" placeholder="输入搜索关键字" />
            <a id="s_p_search_btn" href="#" class="easyui-linkbutton" style="width: 80px;" iconcls="icon-search">搜索</a>
        </div>
        <div id="searchlist" style="width: 350px; height: 460px; margin-right:10px; float:left;"></div>
        <div style="width:600px;height:460px;border:none; float:left;" id="BaiduDitu"></div>
        <div style="clear:both;"></div>
    </div>
</body>
</html>
