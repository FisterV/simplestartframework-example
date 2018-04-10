<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <!-- 发送一组同名的数据 -->
     <form action="${pageContext.request.contextPath }/list.do" method="post">
       <input name="username" type="text" /><br/>
       <input name="username" type="text" /><br/>
       <input name="username" type="text" /><br/>
       <input name="username" type="date"><br/>
         <input type="submit">
     </form>
</body>
</html>