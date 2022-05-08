package com.example.inventory.exception;

import java.util.Date;

public class ExceptionFormat {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	private Date timestamp;
	private String path;
	public ExceptionFormat(String message, Date timestamp, String path) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.path = path;
	}
}
