package com.aaa.alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
	public List<AlarmMessage> getFromDB() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        List<AlarmMessage> list=new ArrayList<AlarmMessage>();

        String dirver="com.mysql.jdbc.Driver";
        String user="root";
        String psd="root";
        String database="mn_cs";
        String url="jdbc:mysql://127.0.0.1/"+database+"?user="+user+"&password="+psd;
        Class.forName(dirver).newInstance();
        Connection conn= DriverManager.getConnection(url);
        Statement stat=conn.createStatement();
        String sql="select * from accessno";
        ResultSet rs=stat.executeQuery(sql);
        while (rs.next()){
            AlarmMessage alarmMessage=new AlarmMessage(rs.getString(1),rs.getString(2));
            list.add(alarmMessage);
        }
        rs.close();
        stat.close();
        conn.close();
        return list;
    }

}
