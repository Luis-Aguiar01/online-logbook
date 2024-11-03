package br.edu.dsw1;

import java.io.IOException;
import java.time.LocalDateTime;

import br.edu.dsw1.entities.Message;
import br.edu.dsw1.repositories.GuestBookDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final GuestBookDatabase repository;
	
	public RegisterMessageServlet() {
		repository = GuestBookDatabase.getInstance();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var name = request.getParameter("name");
		var text = request.getParameter("message");
		
		if (name != null && text != null) {
			var message = new Message(name, text, LocalDateTime.now());
			repository.addMessage(message);
			request.setAttribute("messages", repository.getAll());
			var dispatcher = request.getRequestDispatcher("messages.jsp");
			dispatcher.forward(request, response);
		}
	}
}
