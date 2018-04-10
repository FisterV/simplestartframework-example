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
     <form action="${pageContext.request.contextPath }/user/map_login.do" method="post">
      用户名： <input name="user.username" type="text" /><br/>
      密 码：    <input name="user.password" type="text" /><br/>
     年 龄：    <input name="user.age" type="text" /><br/>
      日期：    <input name="user.date" type="date"><br/>
         <input type="submit">
     </form>
</body>
</html>