<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome User</h3>
<!-- 
<p>Name:${model_name}</p>
<p>Email:${model_email}</p>
<p>Phone No::${model_ph}</p>
-->

<p>Name:${user.getName()}</p>
<p>Email:${user.getEmail()}</p>
<p>Phone No::${user.getPhoneno()}</p>

</body>
</html>