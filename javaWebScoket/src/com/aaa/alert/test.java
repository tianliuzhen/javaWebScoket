package com.aaa.alert;

import java.sql.SQLException;
import java.util.List;

public class test {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws InstantiationException 
	 * @throws IllegalAccessException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
		// TODO Auto-generated method stub
    DBUtil d=new DBUtil();
    List<AlarmMessage> list=  d.getFromDB();
   for (AlarmMessage alarmMessage : list) {
	System.out.print(alarmMessage.getNo());
	System.out.println(alarmMessage.getDescription());
}
	}

}
