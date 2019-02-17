<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入力チェック</title>
<link rel="stylesheet" type="text/css" href="./css/check.css" />

<script type="text/javascript">
	function notNullCheck() {
		var firstName = document.getElementById("firstName").value;
		var lastName = document.getElementById("lastName").value;

		if (firstName == null || firstName.trim().length == 0){
			alert("エラー；姓が必要です");
		} else if (lastName == null || lastName.trim().length == 0){
			alert("エラー；名が必要です");
		} else {
		checkStudentNo(false);
		}
	}
		function checkStudentNo(nullAbled){

			var studentNo = getTrimedStr(document.getElementById("studentNo").value);
			var re = new RegExp(/^[0-9a-zA-Z]*$/);
			if (nullAbled) {
				if (studentNo != null && studentNo.length > 0) {
					if (studentNo.length > 10) {
						alert("エラー：　10 文字以内で入力して下さい。");
					} else if (!studentNo.match(re)) {
						alert("エラー：　学号が入力ミス。");
					} else {
						alert("正常：　[" + studentNo + "]");
					}
				} else {
					alert("正常：[" + studentNo + "]");
				}
			} else {
				if (studentNo == null || studentNo.length == 0) {
					alert("エラー：　学号が必要です。");
				} else if (studentNo.length > 10) {
					alert("エラー：　10 文字以内で入力して下さい。");
				} else if (!studentNo.match(re)) {
					alert("エラー：　学号が入力ミス。");
				} else {
					alert("正常：　[" + studentNo + "]");
				}
			}
		}

		function getTrimedStr(str) {

			if (str != null) {
				return str.trim();
			} else {
				return str;
			}
		}
</script>



</head>
<body>
	<div width="100px">
		<input id="firstName" width="80px" type="text">&nbsp;&nbsp;<label>姓</label>
	</div>

	<div width="100px">
		<input id="lastName" width="80px" type="text">&nbsp;&nbsp;<label>名</label>
	</div>

	<div width="100px">
		<input id="studentNo" width="80px" type="text">&nbsp;&nbsp;<label>学号</label>
	</div>
	<div>
		<input type="button" onClick="notNullCheck();" value="確定">
	</div>
</body>
</html>