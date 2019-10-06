package com.aaa.alipay;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;

public class alipaytwoa extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
	  // 获得初始化的AlipayClient
    AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
    		AlipayConfig.merchant_private_key, "json", AlipayConfig.charset,
            AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
    //付款金额，必填
    String payables=request.getParameter("payables");
    System.out.println(payables);
    //用户编号号
    String userID=request.getParameter("userID");
    // 设置请求参数
    System.out.println(userID);
    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
   
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    // 商户订单号，商户网站订单系统中唯一订单号，必填
    String out_trade_no = sdf.format(new Date());
    //标题
    String subject="支付订单";
    //备注
   String body="本次订单";
    // 付款金额，必填
    String total_amount = payables.replace(",", "");
    
    String timeout_express="2m";
    // 销售产品码 必填
    String product_code="FAST_INSTANT_TRADE_PAY";
   /* alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
            + "\"total_amount\":\"" + total_amount+ "\"," 
    		+ "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
            + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");*/
    
    // 封装请求支付信息
    AlipayTradeWapPayModel model=new AlipayTradeWapPayModel();
    model.setOutTradeNo(out_trade_no);
    model.setSubject(subject);
    model.setTotalAmount(total_amount);
    model.setBody(body);
    model.setTimeoutExpress(timeout_express);
    model.setProductCode(product_code);
    alipayRequest.setBizModel(model);
    
    
    //String notify_url="http://localhost:8080/javaWebScoket/b?subject="+userID+"&money="+payables;
    String notify_url="http://localhost:8080/javaWebScoket/b?userId="+userID+"";
    alipayRequest.setReturnUrl(notify_url);
   //alipayRequest.setNotifyUrl(config.notify_url);
    
    // 请求
    String result = null;
	try{
		result = alipayClient.pageExecute(alipayRequest).getBody();
		//System.out.println(result);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    response.setContentType("text/html; charset=gbk");
    PrintWriter out;
	try {
		 out = response.getWriter();
		  out.print(result);
		
		     
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   

}
}