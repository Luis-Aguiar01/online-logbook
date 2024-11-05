package br.edu.dsw1;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import br.edu.dsw1.repositories.GuestBookDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/messages.do")
public class ShowMessagesServlet extends HttpServlet {
	private final static long serialVersionUID = 1L;
	private final GuestBookDatabase repository;
	
	public ShowMessagesServlet() {
		repository = GuestBookDatabase.getInstance();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		var out = response.getWriter();
		
		var dispatcher = request.getRequestDispatcher("header.jsp");
		dispatcher.include(request, response);
		
		out.println("<div class=\"flex flex-col bg-white p-10 w-5/6 items-center justify-center text-center rounded-lg shadow-lg mb-20\">\r\n"
				+ "		<table class=\"table-auto w-full border-collapse\">\r\n"
				+ "			<thead>\r\n"
				+ "				<tr class=\"bg-gray-800 text-white\">\r\n"
				+ "					<th class=\"py-4 px-6 w-1/5 border-b-4 border-gray-600 text-lg\">Name</th>\r\n"
				+ "					<th class=\"py-4 px-6 w-3/5 border-b-4 border-gray-600 text-lg\">Message</th>\r\n"
				+ "					<th class=\"py-4 px-6 w-1/5 border-b-4 border-gray-600 text-lg\">Date Time</th>\r\n"
				+ "				</tr>\r\n"
				+ "			</thead>\r\n"
				+ "			<tbody>\r\n");
		
		if (!repository.getAll().isEmpty()) {
			for (var message : repository.getAll()) {
				out.println(
						"   <tr class=\"hover:bg-gray-100 transition duration-200\">\r\n"
						+ "		<td class=\"py-4 px-6 w-1/5 border-b border-gray-300\">" + message.getName() + "</td>\r\n"
						+ "		<td class=\"py-4 px-6 w-3/5 border-b border-gray-300 text-center\">" + message.getText() + "</td>\r\n"
						+ "		<td class=\"py-4 px-6 w-1/5 border-b border-gray-300 text-center\">" + formatter.format(message.getDateTime()) + " </td>\r\n"
						+ "	</tr>");
			}
		}
		
		out.print("			</tbody>\r\n"
				+ "		</table>\r\n"
				+ "		<a href=\"register.jsp\" class=\"bg-blue-700 mt-20 w-1/4 py-4 px-4 text-center rounded-lg hover:bg-blue-600 cursor-pointer text-white font-bold\">"
				+ "			<button>Send Message</button>"
				+ "		</a>"
				+ "	</div>");
		
		dispatcher = request.getRequestDispatcher("footer.jsp");
		dispatcher.include(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
