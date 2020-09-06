<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <script src="https://www.w3schools.com/lib/w3.js"></script>
    <title>Title</title>
</head>
<body>
<div id="id01">
    {{firstName}} {{lastName}}
</div>
<div >

        {{firstName}} {{nikename}}
    </d

<p>{{fullname}}</p>
<select>
    <option w3-repeat="singers">{{fullname}}</option>
</select>
</div>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Full Name</td>
        <td>Nike Name</td>
        <td>Show Details</td>
    </tr>
    <c:forEach var="singer" items="${singers}">
        <tr>
            <td>${singer.id}</td>
            <td>${singer.fullname}</td>
            <td>${singer.nikename}</td>
            <td><a href="/singer/detail?id=${singer.id}">show</a></td>
        </tr>

    </c:forEach>

</table>
</body>
<script>
    var myObject = {"firstName" : "John", "lastName" : "Doe"};
    w3.displayObject("id01", myObject);
</script>
<%--<script>--%>
<%--    var myObject = [{"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]},{"id":2,"fullname":"sfd","nikename":"sfd","age":"12","alboms":[]}];--%>
<%--    w3.displayObject("id01", myObject);--%>
<%--</script>--%>

<%--<script>--%>
<%--    w3.displayObject("id01", {"singers" : {"id":1,"fullname":"hamed","nikename":"tatalol23","age":"27","alboms":[]}});--%>
<%--</script>--%>
</html>
