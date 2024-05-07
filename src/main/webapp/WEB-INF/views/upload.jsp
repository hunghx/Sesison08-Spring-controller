<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 5/7/2024
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="Send">
</form>
<img src="${url}" alt="" width="300">
</body>
</html>
