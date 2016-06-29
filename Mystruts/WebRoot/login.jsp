<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginAction.action" method="post">
 <div>UserName:<input type="text" name="user.username"><s:fielderror name="username"></s:fielderror></div>
 <div>PassWord:<input type="password" name="user.password"></div>
 <div>BookOne:<input type="text" name="booklist[0]"></div>
 <div>BookTwo:<input type="text" name="booklist[1]"></div>
 <div>Age:<input type="text" name="age"></div>
 <div><input type="submit" value="Submit"></div>
</form>

</body>
</html>