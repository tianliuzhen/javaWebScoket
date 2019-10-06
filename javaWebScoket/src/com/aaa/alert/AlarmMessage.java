package com.aaa.alert;

public class AlarmMessage {
    private String no;
    private String description;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AlarmMessage(String no, String description) {
		super();
		this.no = no;
		this.description = description;
	}
	public AlarmMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}