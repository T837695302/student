
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>信息管理</title>
<link rel="stylesheet" type="text/css" href="./css/allp.css" />
<style type="text/css"></style>
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>


</head>
<body>
	<img src="./images/header.jpg" /> ${msg}
	<h1 align="center">信息管理</h1>
	<div id="all_comm" class="allp">
		<h2 align="center">信息一览</h2>
		<table id="items">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>出生年月</td>
				<td>年龄</td>
				<td>分数</td>
				<td>先生id</td>
				<td>先生氏名</td>
				<td>授業科目</td>
			</tr>

			<c:forEach items="${students}" var="student">
				<tr>
					<td id="id${student.id }">${student.id}</td>
					<td id="name${student.id }">${student.name}</td>
					<td id="birthday${student.id}">${student.birthday}</td>
					<td id="age${student.id }">${student.age}</td>
					<td id="score${student.id}">${student.score}</td>
					<td id="teacherid${teacher.id}">${student.teacherid}</td>
					<td id="teachername${student.id}">${student.teachername}</td>
					<td id="course${student.id}">${student.course}</td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>