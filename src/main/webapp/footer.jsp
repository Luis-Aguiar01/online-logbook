<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<footer class="w-full py-4 bg-gray-900 text-white text-center mt-10">
    <p class="text-lg">
        <% 
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
        %>
        
        <%= formatter.format(LocalDateTime.now()) %>
    </p>
</footer>
</body>
</html>