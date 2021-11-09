package com.project.exceptions;

import java.util.Date;

public class ExceptionStatus {

	private Date date;
	private String msg;
	private String details;
	public ExceptionStatus() {
		
	}
	public ExceptionStatus(Date date, String msg, String details) {
		super();
		this.date = date;
		this.msg = msg;
		this.details = details;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
