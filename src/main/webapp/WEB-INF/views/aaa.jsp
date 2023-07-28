<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link href="/SpringMake/static/hello.css"> <!-- 정적자원은 컨트롤러없이 바로 연결해야 함 -->
<body>

	<%
		String data = (String) request.getAttribute("data");
	%>
	컨트롤러에서 도착한 데이터: <%=data %>

</body>
</html>