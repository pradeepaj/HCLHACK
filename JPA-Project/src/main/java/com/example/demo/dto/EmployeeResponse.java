package com.example.demo.dto;

public class EmployeeResponse {

	private int statusCode;
	private String message;

	public EmployeeResponse() {

	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeResponse(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

}
