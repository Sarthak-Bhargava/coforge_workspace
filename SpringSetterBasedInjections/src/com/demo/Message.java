package com.demo;

public class Message {

	// creating setter method for this to inject the dependency
	WriteMessage writeMessage;

	public WriteMessage getWriteMessage() {
		return writeMessage;
	}

	public void setWriteMessage(WriteMessage writeMessage) {
		this.writeMessage = writeMessage;
	}
	
	private String id;
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show() {
		writeMessage.WriteMessage();
	}
}
