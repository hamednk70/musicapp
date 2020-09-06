<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: ۲۰۲۰/۰۸/۳۰
  Time: ۱۲:۱۷ بعدازظهر
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
test
<form action="/singer/update" method="post">
    <input type="hidden" value="${singer.id}" name="id">
    <p>Full Name : <input type="text" value="${singer.fullname}" name="fullname"></p>
    <p>Age : <input type="text" value="${singer.age}" name="age"></p>
    <p>Nike Name : <input type="text" value="${singer.nikename}" name="nikename"></p>
    <p><input type="submit">update</p>
</form>
</body>
</html>
