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
${sessionScope.singer}

<p>Full Name : <input type="text" value="${sessionScope.singer.fullname}" name="fullname"></p>
<p>Age : <input type="text" value="${sessionScope.singer.age}" name="age"></p>
</body>
</html>
