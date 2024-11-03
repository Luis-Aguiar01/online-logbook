package br.edu.dsw1;

import java.io.IOException;

import br.edu.dsw1.entities.Message;
import br.edu.dsw1.repositories.GuestBookDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final GuestBookDatabase repository;
	
	public RegisterMessageServlet() {
		repository = GuestBookDatabase.getInstance();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var name = request.getParameter("name");
		var text = request.getParameter("text");
		
		if (name != null && text != null) {
			var message = new Message(name, text);
			repository.addMessage(message);
		}
	}
}
