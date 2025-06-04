<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-06-04
  Time: 오후 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>scope 데이터 보기</h1>
  <br/>
  <p>
  <p>pageScope의 속성값은 : ${pageScope.scopeName}</p>
  <p>requestScope의 속성값은 : ${requestScope.scopeName}</p>
  <p>sessionScope의 속성값은 : ${sessionScope.scopeName}</p>
  <p>application의 속성값은 : ${applicationScope.scopeName}</p>
  <p>scopeName 자동 찾기 : ${scopeName}</p>
  <p>member : ${member.name}(${member.userid})</p>
  </p>
</body>
</html>
