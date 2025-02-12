<%@page import="com.vs.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
<h2>Welcome</h2>

<%
User user=(User) session.getAttribute("Session_User");
%>

<h3>
Name:<%=user.getName() %>
</h3>

<h3>
Email:<%=user.getEmail()%>
</h3>

<h3>
City:<%=user.getCity()%>
</h3>

<a href="Logout">Logout</a>
</body>
</html>