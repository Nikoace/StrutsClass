<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Nikoace
  Date: 2018/3/12
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/aa/test!num.action" method="post">
    username: <input type="text" name="username">
    password: <input type="password" name="pass">
    <img alt="" src="/aa/codeimage.action">
    <input type="submit" value="submit">
</form>
当前访问次数：<s:property value="num"/>
总访问次数：<s:property value="allnum"/>

</body>
</html>
