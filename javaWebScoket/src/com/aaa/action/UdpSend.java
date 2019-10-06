package com.aaa.action;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UdpSend {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		ds=new DatagramSocket();//用来完成消息的发送
		String info="hello word";
		System.out.println();
		dp=new DatagramPacket(info.getBytes(),info.getBytes().length,InetAddress.getByName("127.0.0.1"),3000);
		ds.send(dp);
		ds.close();
	}
}
