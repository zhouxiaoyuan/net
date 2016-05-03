addbrand.jsp<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"%>
<%
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="images/main.css" type="text/css">
		<script src="js/jquery-1.4.2.min.js"></script>
		<script src="js/jquery.validate.min.js"></script>
		<script src="js/jquery.metadata.js"></script>
		<script src="js/main.js"></script>
		<script src="/editor/kindeditor.js"></script>
		<script language="javascript">
			$(function(){
				$(".form tr td:even").addClass("left").siblings().addClass("right");
				$("#form1").validate();
				$(".upload").click(function(){
					var obj = $(this).prev("input");
					if($(this).parent().find("#"+obj.attr("name")).length == 0){
						$(this).parent().append("<div id='"+obj.attr("name")+"'><iframe src='img.jsp?id="+obj.attr("name")+"&zoom="+obj.attr("zoom")+"&f="+obj.attr("f")+"' frameborder='0' width='800' height='30'></iframe></div>");
					}
				});
			});
		</script>
	</head>
	<body>
		<div class="maintitle">★  添加品牌</div>
		<form id="form1" method="post" action="Brand_add.do">
		<table class="form" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td>名称：</td>
				<td><input name="name" class="w400 required"></td>
			</tr>
			<tr>
				<td>品牌故事：</td>
				<td><input name="storypic" class="w400 required" f="brand" zoom="">&nbsp;<input type="button" value="上传" class="button upload"><div id="showstorypic"></div></td>
			</tr>
			<tr>
				<td>品牌logo：</td>
				<td><input name="logo" class="w400 required" f="brand" zoom="">&nbsp;<input type="button" value="上传" class="button upload"><div id="showlogo"></div></td>
			</tr>
			<tr>
				<td>链接：</td>
				<td><input name="link" class="w400 required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="确 定" class="button"></td>
			</tr>
		</table>
		</form>
		<br>
	</body>
</html>
