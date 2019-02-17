<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>先生管理</title>
<link rel="stylesheet" type="text/css" href="./css/all.css" />
<style type="text/css">
</style>
<script type="text/javascript">

</script>
</head>
<body>
	<img src="./images/header.jpg" />
	<h1 align="center">先生信息管理</h1>
	<div id="all_comm" class="all">
		<h2 align="center">先生信息一览</h2>
		<table id="items">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>科目</td>
			</tr>

			<c:forEach items="${teachers}" var="teacher">
				<tr>
					<td id="${teacher.id }">${teacher.id}</td>
					<td id="${teacher.id }">${teacher.teachername}</td>

				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>