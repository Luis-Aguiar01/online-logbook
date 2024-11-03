<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<tr class="hover:bg-gray-100 transition duration-200">
					<td class="py-4 px-6 w-1/5 border-b border-gray-300">Luis Henrique</td>
					<td class="py-4 px-6 w-3/5 border-b border-gray-300 text-left">Hello, World! Hello, World! Hello, World! Hello, World! Hello, World! Hello, World!</td>
					<td class="py-4 px-6 w-1/5 border-b border-gray-300 text-center">31/02/2000 12:32:12</td>
				</tr>
				<tr class="hover:bg-gray-100 transition duration-200">
					<td class="py-4 px-6 w-1/5 border-b border-gray-300">Jane Doe</td>
					<td class="py-4 px-6 w-3/5 border-b border-gray-300 text-left">This is a test message  slightly longer to test wrapping.</td>
					<td class="py-4 px-6 w-1/5 border-b border-gray-300 text-center">31/02/2000 14:22:45</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>