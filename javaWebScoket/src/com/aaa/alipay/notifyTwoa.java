package com.aaa.alipay;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class notifyTwoa extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		   // �̻�������
	       String orderID = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "GBK");
	       // ���
	       String mon = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "GBK");
	        //��������
	     String userID=new String(request.getParameter("userId").getBytes("ISO-8859-1"), "GBK");
	       System.out.println(orderID);
	     //���ܵĽ������
	         System.out.println(mon);
	      System.out.println(userID);
        //
          request.getRequestDispatcher("/appy.jsp").forward(request, response);
          
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
