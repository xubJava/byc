<%@ page contentType="text/html; charset=UTF-8"  language="java"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'hello.jsp' starting page</title>
  </head>
  
  <body>
    This is my JSP page. <br>
    <h3>欢迎 ${hh},当前时间：${now}</h3>
    <h4>nihao</h4>
  </body>
</html>
