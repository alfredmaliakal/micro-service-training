package com.trinity.app.ws.ui.model.response;

import java.util.Date;

public class ErrorMessage {

	private Date timestamp;
	private String message;
	private String statusCode;
	private String statusDesc;

	public ErrorMessage() {

	}

	public ErrorMessage(Date timestamp, String message,String statusCode, String statusDesc) {
		this.timestamp = timestamp;
		this.message = message;
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
