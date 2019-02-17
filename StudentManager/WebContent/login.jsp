<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script src="../js/jquery-1.11.3.js"></script>

<link rel="stylesheet" type="text/css" href="./css/allp.css" />
<title>test</title>
<h1>Hellow world! 1</h1>
<h2>Hellow world! 2</h2>
<h3>Hellow world! 3</h3>
<h4>Hellow world! 4</h4>
<h5>Hellow world! 5</h5>
<h6>Hellow world! 6</h6>
<a href="http://www.baidu.com">百度</a>

<div style="width:400px; height:70px; overflow-y:auto;  overflow-x:hidden; top:10px; left:10px; position:relative;">
	<table cellspacing="0px" cellspadding="0px" width="300px">
		<tr>
			<td rowspan="3" width="100px">ID</td>
			<td width="100px">名前</td>
			<td width="100px">クラスID</td>
		</tr>
		<tr>
			<td>田中</td>
			<td>67</td>
		</tr>
		<tr>

			<td>山田</td>
			<td>68</td>
		</tr>
		<tr>
			<td colspan="2">私は二つrow</td>
			<td>aaa</td>
		</tr>
	</table>
	<div style="position:absolute; top:10px; left:10px;">wo de<br> zei zhi</div>
</div>
<p>
	duan<br>luo
</p>
<span>wo shi <br> span</span>
<input id="age" name="age" type="text" width="150px"/>
<br>
<textarea rows="3" cols="20">
12345678901234567890
bbbbbbbbbbbbbbbb
ccccccccccccc
</textarea>
<br>
<input name="a2" type="checkbox"/><span>ball</span><input name="a2" type="checkbox"/><span>ball</span><br><input name="a1" type="radio"/><span>ball</span><input name="a1" type="radio"/><span>ball</span>
<br>
<select>
	<option value="1">basketball</option>
	<option value="2">football</option>
	<option value="3">pinpangball</option>
</select>
</head>
<body>
<form>
<input id="inputid" type="text"><p>username</p>
</form>
<a id="ajaxbtn" href="javascript:void(0);">hello</a>
<script type="text/javascript">
		$(function(){
			$('#ajaxbtn').click(function(){
				var ajaxUrl = 'myajax';
				var username = $("#inputid").val();
				var param = {id:username};
				$.getJSON(ajaxUrl,param,function(result){
					if(!result.result){
						alert('接口失敗');
						return false;
					}else{
						alert("接口成功");
					};
					var data = result.data;
					var html = "<table align='center'cellspacing='0px' cellspadding='0px' width='400px'><tr><th>id</th><th>名字</th><th>生年月日</th><th>年齡</th><th>分数</th></tr>"
					for(var i=0;i<data.length;i++){

						html+="<tr><td>"+data[i].id+"</td>"
						html+="<td>"+data[i].name+"</td>"
						html+="<td>"+data[i].birthday+"</td>"
						html+="<td>"+data[i].age+"</td>"
						html+="<td>"+data[i].score+"</td></tr>"

					}
					html+='</table>'


					$("body").append(html);
				//	$("#inputid").hide();
					//$("#inputpsd").hide();
				//	$("#but").hide();
					//$("body").css('background-color','green');
				});
			});
		});
	</script>
</script>
</body>
</html>

