
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>商品注文管理</title>
<link rel="stylesheet" type="text/css" href="./css/allp.css" />
<style type="text/css"></style>
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$("#buttonsearchbyid").click(function(){
	var input_searchbyid=$("#inputsearchbyid").val();
	if(input_searchbyid==""||input_searchbyid==null){
		alert("番号を入力してください");
		return false;
	}else{
		$("#formsearchbyid").submit();
	}
	});
});

$(document).ready(function(){
	$("#buttonaddproduct").click(function(){
	var input_addproductname=$("#inputaddproductname").val();
	if(input_addproductname==""||input_addproductname==null){
		alert("商品名を入力してください")
		return false;
	}
	var input_addproductsupplier=$("#inputaddproductsupplier").val();
	if(input_addproductsupplier==""||input_addproductsupplier==null){
		alert("産地を入力してください")
		return false;
	}
	var input_addproducttype=$("#inputaddproducttype").val();
	if(input_addproducttype==""||input_addproducttype==null){
		alert("商品種類を入力してください")
		return false;
	}
	var input_addproductindate=$("#inputaddproductindate").val();
	if(input_addproductindate==""||input_addproductindate==null){
		alert("注文日付を入力してください")
		return false;
	}
	var input_addproductprice=$("#inputaddproductprice").val();
	if(input_addproductprice==""||input_addproductprice==null){
		alert("価格を入力してください")
		return false;
	}
	var input_addproductamount=$("#inputaddproductamount").val();
	if(input_addproductamount==""||input_addproductamount==null){
		alert("量を入力してください")
		return false;
	}
	$("#formaddproduct").submit();
	})
})
$(document).ready(function(){
	$("#buttondelbyid").click(function(){
	var input_delbyid=$("#inputdelbyid").val();
	if(input_delbyid==""||input_delbyid==null){
		alert("番号を入力してください");
		return false;
	}else{
		$("#formdelbyid").submit();
	}
	});
});
$(document).ready(function(){
	$("#buttoneditproduct").click(function(){
	var input_editbyid=$("#inputeditbyid").val();
	if(input_editbyid==""||input_editbyid==null){
		alert("注文番号を入力してください")
		return false;
	}
	var input_editproductname=$("#inputeditproductname").val();
	if(input_editproductname==""||input_editproductname==null){
		alert("商品名を入力してください")
		return false;
	}
	var input_editproductsupplier=$("#inputeditproductsupplier").val();
	if(input_editproductsupplier==""||input_editproductsupplier==null){
		alert("産地を入力してください")
		return false;
	}
	var input_editproducttype=$("#inputeditproducttype").val();
	if(input_editproducttype==""||input_editproducttype==null){
		alert("商品種類を入力してください")
		return false;
	}
	var input_editproductindate=$("#inputeditproductindate").val();
	if(input_editproductindate==""||input_editproductindate==null){
		alert("注文日付を入力してください")
		return false;
	}
	var input_editproductprice=$("#inputeditproductprice").val();
	if(input_editproductprice==""||input_editproductprice==null){
		alert("価格を入力してください")
		return false;
	}
	var input_editproductamount=$("#inputeditproductamount").val();
	if(input_editproductamount==""||input_editproductamount==null){
		alert("量を入力してください")
		return false;
	}
	$("#formeditproduct").submit();
	})
})

</script>
</head>
<body>
	<img src="./images/header.jpg" />
	<h1 align="center">商品注文管理</h1>
	<h2 align="center">注文情報</h2>
	<table id="items">
		<tr>
			<td>注文番号</td>
			<td>商品名</td>
			<td>産地</td>
			<td>商品種類</td>
			<td>注文日付</td>
			<td>価格</td>
			<td>量</td>
		</tr>

		<c:forEach items="${products}" var="product">
			<tr>
				<td id="${product.id }">${product.id}</td>
				<td id="${product.id }">${product.productname}</td>
				<td id="${product.id}">${product.supplier}</td>
				<td id="${product.id }">${product.type}</td>
				<td id="${product.id}">${product.indate}</td>
				<td id="${product.id}">${product.price}</td>
				<td id="${product.id}">${product.amount}</td>
			</tr>
		</c:forEach>
	</table>
	<div id="add_comm" class="all" align="center">
			<h2>注文情報の検索</h2>
			<form id="formsearchbyid" action="queryByIdproduct" method="post">
				<input id="inputsearchbyid"type="text" placeholder="注文番号" name="id">
				<button id="buttonsearchbyid" type="button" >
				<p>検索</p>
				</button>
			</form>
	</div>
	<div id="add_comm" class="all" align="center">
			<h2>注文情報の追加</h2>
			<form id="formaddproduct" action="addproduct" method="post">
				<input id="inputaddproductname"type="text" placeholder="商品名" name="productname">
				<input id="inputaddproductsupplier"type="text" placeholder="産地" name="supplier">
				<input id="inputaddproducttype"type="text" placeholder="商品種類" name="type">
				<input id="inputaddproductindate"type="text" placeholder="注文日付" name="indate">
				<input id="inputaddproductprice"type="text" placeholder="価格" name="price">
				<input id="inputaddproductamount"type="text" placeholder="量" name="amount">
				<button id="buttonaddproduct" type="button" >
				<p>追加</p>
				</button>
			</form>
	</div>
	<div id="add_comm" class="all" align="center">
			<h2>注文情報の削除</h2>
			<form id="formdelbyid" action="delproduct" method="post">
				<input id="inputdelbyid"type="text" placeholder="注文番号" name="id">
				<button id="buttondelbyid" type="button" >
				<p>削除</p>
				</button>
			</form>
	</div>
	<div id="add_comm" class="all" align="center">
			<h2>注文情報の変更</h2>
			<form id="formeditproduct" action="editproduct" method="post">
				<input id="inputeditbyid"type="text" placeholder="注文番号" name="id"><br>
				<input id="inputeditproductname"type="text" placeholder="商品名" name="productname">
				<input id="inputeditproductsupplier"type="text" placeholder="産地" name="supplier">
				<input id="inputeditproducttype"type="text" placeholder="商品種類" name="type">
				<input id="inputeditproductindate"type="text" placeholder="注文日付" name="indate">
				<input id="inputeditproductprice"type="text" placeholder="価格" name="price">
				<input id="inputeditproductamount"type="text" placeholder="量" name="amount">
				<button id="buttoneditproduct" type="button" >
				<p>変更</p>
				</button>
			</form>
	</div>
</body>
</html>