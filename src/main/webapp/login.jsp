<%--
  Created by IntelliJ IDEA.
  User: shuaigehong
  Date: 2015/12/6
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login/login.htm" method="post">
    <input type="text" name="userName">
    <input type="submit">
</form>
</body>
</html>
