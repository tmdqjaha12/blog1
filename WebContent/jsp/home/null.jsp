<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>입력하신 정보는 "${nullDan}" 입니다</div>
	
	<div>${mesege}</div>

	<form action="HomeDanServlet" method="get">
        <div><button type="submit">뒤로가기</button></div>
    </form>
</body>
</html>