<%@page language="java" contentType="text/html;" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../statics/mystyle.css">

    <script>
        alert("<%=basePath%>");
    </script>
</head>
<body>
    Welcome To Spring MVC!
</body>
</html>