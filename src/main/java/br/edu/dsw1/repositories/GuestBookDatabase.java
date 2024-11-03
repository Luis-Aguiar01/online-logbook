package br.edu.dsw1.repositories;

import java.util.LinkedList;
import java.util.List;

import br.edu.dsw1.entities.Message;

public class GuestBookDatabase {
	private final List<Message> messages;
	private static GuestBookDatabase instance;
	
	public GuestBookDatabase() {
		this.messages = new LinkedList<>();
	}
	
	public void addMessage(Message message) {
		messages.add(message);
	}
	
	public static GuestBookDatabase getInstance( ) {
		if (instance == null) {
			instance = new GuestBookDatabase();
		}
		return instance;
	}
}
