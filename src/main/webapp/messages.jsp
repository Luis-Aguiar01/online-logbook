<%@page import="br.edu.dsw1.entities.Message"%>
<%@page import="java.util.List"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="br.edu.dsw1.repositories.GuestBookDatabase"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	List<Message> messages = (List<Message>) request.getAttribute("messages");
	var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdn.tailwindcss.com"></script>
<title>Messages</title>
</head>
<body class="bg-gradient-to-r from-black to-gray-800 min-h-screen flex flex-col font-mono items-center justify-center box-border">
	
	<div class="flex bg-white p-10 w-5/6 items-center justify-center text-center rounded-lg shadow-lg">
		<table class="table-auto w-full border-collapse">
			<thead>
				<tr class="bg-gray-800 text-white">
					<th class="py-4 px-6 w-1/5 border-b-4 border-gray-600 text-lg">Name</th>
					<th class="py-4 px-6 w-3/5 border-b-4 border-gray-600 text-lg">Message</th>
					<th class="py-4 px-6 w-1/5 border-b-4 border-gray-600 text-lg">Date Time</th>
				</tr>
			</thead>
			<tbody>
				<% for (var message : messages) { %>
					<tr class="hover:bg-gray-100 transition duration-200">
						<td class="py-4 px-6 w-1/5 border-b border-gray-300"> <%= message.getName() %> </td>
						<td class="py-4 px-6 w-3/5 border-b border-gray-300 text-center"> <%= message.getText() %> </td>
						<td class="py-4 px-6 w-1/5 border-b border-gray-300 text-center"> <%= formatter.format(message.getDateTime()) %> </td>
					</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>