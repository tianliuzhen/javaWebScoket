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
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=R1yasWrMtFbo2hEnyu31aokZSXGcNshP"></script> <script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript">
            function initMap(){
                createMap();//创建地图
                setMapEvent();//设置地图事件
            }
            //创建地图函数：
            function createMap(){
        var map = new BMap.Map("allmap");
var point = new BMap.Point(118.103886,24.489230);
map.centerAndZoom(point,16);

var geolocation = new BMap.Geolocation();
// 开启SDK辅助定位
geolocation.enableSDKLocation();
geolocation.getCurrentPosition(function(r){
	if(this.getStatus() == BMAP_STATUS_SUCCESS){
		var mk = new BMap.Marker(r.point);
		map.addOverlay(mk);
		map.panTo(r.point);
		point = new BMap.Point(r.point.lng,r.point.lat);
		map.centerAndZoom(point,16);
		alert('您的位置：'+r.point.lng+','+r.point.lat);
	}
	else {
		alert('failed'+this.getStatus());
	}        
 });
   //
   function myFun(result){
	var cityName = result.name;
	map.setCenter(cityName);
	alert("当前定位城市:"+cityName);
}
var myCity = new BMap.LocalCity();
myCity.get(myFun); 
   //

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
        <div style="width:600px;height:460px;border:none; float:left;" id="allmap"></div>
        <div style="clear:both;"></div>
    </div>
</body>
</html>
