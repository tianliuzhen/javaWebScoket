package com.aaa.alert;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/websocketAlert")
public class webscoket {
	 @OnOpen
	    public void onOpen(Session session){
	        OneThread thread =null;
	        thread=new OneThread(session);
	        thread.start();
	        thread.yield();
	    }
	
}
