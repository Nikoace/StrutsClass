<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Nikoace
  Date: 2018/4/16
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function info() {
        $("#aa").load("infoprint");
    }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<script type="text/javascript">--%>
    <%--function addFile() {--%>
        <%--var uploadHTML = document.createElement("<input type = 'file' name='upload'>");--%>
        <%--document.getElementById("files").appendChild(uploadHTML);--%>
        <%--uploadHTML = document.createElement("<br/>");--%>
        <%--document.getElementById("files").appendChild(uploadHTML);--%>
    <%--}--%>
<%--</script>--%>
<%--<s:form action="up" namespace="/aa" enctype="multipart/form-data">--%>
    <%--<span id="files"><input type="file" name="upload"></span>--%>
    <%--<input type="button" value="add" onclick="addFile();"/>--%>
    <%--<s:submit value="submit"/>--%>
<%--</s:form>--%>
<input type="button" value="get" onclick="info()">
<div id="aa"></div>
</body>
</html>
