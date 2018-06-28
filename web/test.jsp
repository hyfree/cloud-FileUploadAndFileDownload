<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/14
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        File f=new File("");
        out.println(request.getSession().getServletContext().getRealPath("./") +"@"+"upload");


    %>

</body>
</html>
