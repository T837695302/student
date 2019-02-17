<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生一覧</title>
<link rel="stylesheet" type="text/css" href="./css/student.css"/>
</head>
<body>
	<DIV>
		<TABLE>
	 		<THEAD>
	 			<TR>
	 		   		<TH>　iD </TH>
	 		   		<TH> 姓名</TH>
	 		   		<TH> 生年月日</TH>
	 		   		<TH> 年齢</TH>
	 		   		<TH> 分数</TH>
	 			</TR>
	 		</THEAD>
	 		<tbody>
	 				<c:forEach items="${studentFormList}" var="student">
					<TR>
						<td id="id${student.id }">${student.id}</td>
						<td id="name${student.id }">${student.name}</td>
						<td id="birthday${student.id}">${student.birthday}</td>
						<td id="age${student.id }">${student.age}</td>
						<td id="score${student.id}">${student.score}</td>
					</TR>
				</c:forEach>
	 		</tbody>
		</TABLE>
	</DIV>
</body>
</html>