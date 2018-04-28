<%--
  Created by IntelliJ IDEA.
  User: Nikoace
  Date: 2018/2/26
  Time: 9:15
  use HelloWorld struts2
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <s:property value="message"/>
  <form action="/StrutsClass/show.action" method="post">
    name: <input type="text" name="username">
    password:<input type="password" name="passwd">
    <input type="submit" value="submit">
  </form>
  <form action="/aa/mybirthday.action" method="post">
      birthday:<input type="text" name="mDate"/>
      <input type="submit" value="submit"/>
  </form>
  <form action="/aa/myscore.action" method="post">
      mat:<input type="text" name="score"/>
      <br/>
      chi:<input type="text" name="score"/>
      <br/>
      eng:<input type="text" name="score"/>
      <br/>
      phy:<input type="text" name="score"/>
      <br/>
      <input type="submit" value="submit"/>
  </form>
  <form action="/aa/MyProductAction.action" method="post">
      product: <input type="text" name="product">
      <input type="submit">
  </form>
  <s:property value="product"/>
  <s:property value="score"/>
  <br/>
  <s:property value="mDate" />
  <br/>
  <s:date name="mDate" format="yyyy-MM-dd HH:mm:ss"/>
  <br>
  <s:property value="word"/>
  <s:property value="#wordnn"/>
  </body>
</html>
