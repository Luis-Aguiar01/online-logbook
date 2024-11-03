package br.edu.dsw1.entities;

import java.time.LocalDateTime;

public class Message {
	private String name;
	private String text;
	private LocalDateTime dateTime;
	
	public Message(String name, String text, LocalDateTime dateTime) {
		this.name = name;
		this.text = text;
		this.dateTime = dateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
}
