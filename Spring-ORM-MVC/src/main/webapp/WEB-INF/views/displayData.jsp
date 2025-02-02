<%@page import="com.springwork.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Data</title>
</head>
<body>
<%
	 
	Employee emp =(Employee) request.getAttribute("employee"); 
	
 	if(emp != null){
 %>
 <h1><%= emp %></h1>
 <%
}else{
 %>
 <h1><%= "No Data" %></h1>
 <% 	
 	}
 %>	
 	




</body>
</html>