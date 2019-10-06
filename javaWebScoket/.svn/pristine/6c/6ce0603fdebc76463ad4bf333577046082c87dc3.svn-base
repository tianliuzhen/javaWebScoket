package com.aaa.action;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class UdpRecv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  DatagramPacket dp=null;
  DatagramSocket ds=null;
  byte[] buf=new byte[1024];
  try {
	ds=new DatagramSocket(3000);
	dp=new DatagramPacket(buf, 1024);
	ds.receive(dp);
	String str=new String(dp.getData(),0,dp.getLength());
   str=str+" from " +dp.getAddress().getHostAddress();
   System.out.println(str);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
	ds.close();
}
  
	}

}
