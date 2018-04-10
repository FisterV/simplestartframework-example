<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    用户登录
     <form action="${pageContext.request.contextPath }/register.do" method="post">
       用户名：<input name="username" type="text" /><br/>
       密码：  <input name="password" type="text" /><br/>
       年龄：    <input name="age" type="text" /><br/>
     出生日期：   <input name="date" type="date"><br/>
         <input type="submit" value="注册">
     </form>
</body>
</html>