<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
<% 
	var name = session.getAttribute("name");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-r from-black to-gray-800 h-screen flex flex-col font-mono items-center justify-center box-border">
	
	<div class="flex flex-col w-1/2 min-h-1/2 border-solid rounded-xl border-gray-600 bg-white p-5 shadow-2xl shadow-black">
		<h1 class="self-center text-3xl font-bold mt-8 mb-5">Send your message!</h1>
		
		<form action="register.do" method="POST" class="flex flex-col items-center h-full justify-center mt-5">
			
			<% if (name == null) { %>
				<div class="w-2/3 border rounded-lg bg-gray-200 mb-5">
					<input class="w-full text-lg bg-transparent px-5 py-4 outline-none" type="text" name="name" placeholder="Name" required>
				</div>
			<% } else {%>
				<div class="w-2/3 border rounded-lg bg-gray-200 mb-5">
					<input class="w-full text-lg bg-transparent px-5 py-4 outline-none" type="text" name="name" placeholder="Name" readonly value="<%= name %>">
				</div>
			<% } %>
			
			<div class="w-2/3 border rounded-lg bg-gray-200 mb-5">
				<input class="w-full text-lg bg-transparent px-5 py-4 outline-none" type="text" name="message" placeholder="Message" required>
			</div>
			
			<input class="text-lg mb-5 mt-5 bg-black py-3 w-1/3 rounded-lg text-white hover:bg-gray-900 cursor-pointer font-bold" type="submit" value="Enviar">
		
		</form>
	</div>
	

	<a href="messages.do" class="bg-blue-700 mt-10 w-1/6 py-4 px-4 text-center rounded-lg hover:bg-blue-600 cursor-pointer text-white font-bold">
		<button>View All Messages</button>
	</a>

</body>
</html>