<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 5/7/2024
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello ${name}</h1>
<form action="<%=request.getContextPath()%>/add" method="post">
    <input type="text" name="name"><br>
    <input type="text" name="age"><br>
    <input type="text" name="des"><br>
    <input type="submit" value="Send">
</form>
</body>
</html>
