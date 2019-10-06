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
		
	  // ��ó�ʼ����AlipayClient
    AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
    		AlipayConfig.merchant_private_key, "json", AlipayConfig.charset,
            AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
    //���������
    String payables=request.getParameter("payables");
    System.out.println(payables);
    //�û���ź�
    String userID=request.getParameter("userID");
    // �����������
    System.out.println(userID);
    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
   
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    // �̻������ţ��̻���վ����ϵͳ��Ψһ�����ţ�����
    String out_trade_no = sdf.format(new Date());
    //����
    String subject="֧������";
    //��ע
   String body="���ζ���";
    // ���������
    String total_amount = payables.replace(",", "");
    
    String timeout_express="2m";
    // ���۲�Ʒ�� ����
    String product_code="FAST_INSTANT_TRADE_PAY";
   /* alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
            + "\"total_amount\":\"" + total_amount+ "\"," 
    		+ "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
            + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");*/
    
    // ��װ����֧����Ϣ
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
    
    // ����
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