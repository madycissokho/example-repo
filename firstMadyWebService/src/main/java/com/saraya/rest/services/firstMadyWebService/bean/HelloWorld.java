package com.saraya.rest.services.firstMadyWebService.bean;

public class HelloWorld {
	private String message;
	

	public HelloWorld() {
		super();
	}

	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	

}
