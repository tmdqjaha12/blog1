<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>이름은 ${name} 입니다.</div>

    <form action="HomeDanServlet" method="post">
        <div>단 : </div>
        <div><input type="text" name="dan"/></div>
        <div><input type="submit" value="출력"/></div>
    </form>
    
    <!--
    	<div>
		% for( int i = 1; i <= 9; i++) {%
			<div>
				%=dan%> * %=i%> = %=dan * i%>
			</div>
		% } %>
	</div>
    -->
</body>
</html>