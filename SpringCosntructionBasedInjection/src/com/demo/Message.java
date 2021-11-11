package com.demo;

public class Message {
	private String id;
	private String message;
	

	public Message(String id, String message) {

		this.id = id;
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void show() {
		
		System.out.println(" from id " + id);

		System.out.println(" from message " + message);
	}

}
