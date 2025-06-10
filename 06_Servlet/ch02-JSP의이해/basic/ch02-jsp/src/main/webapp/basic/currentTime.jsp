<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-06-04
  Time: 오후 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.util.*" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<h2>현재 날짜 출력 실습</h2>
<p>
  <%
    Date now = new Date();
  %>
    현재 날짜 : <%= now %>
</p>
</body>
</html>
