<%--
  Created by IntelliJ IDEA.
  User: Nikoace
  Date: 2018/3/5
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/aa/meet!cal.action" method="post">
    <input type="radio" name="add" value="1" checked="checked">加&nbsp;&nbsp;
    <input type="radio" name="add" value="2">减&nbsp;&nbsp;
    <input type="radio" name="add" value="3">乘&nbsp;&nbsp;
    <input type="radio" name="add" value="4">除&nbsp;&nbsp;
    <hr>
    <input type="text" name="a">
    <input type="text" name="b">
    <input type="submit" value="submit">
</form>
<s:property value="result"/>
</body>
</html>
