<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.www.cache.*"%>
<%@ page import="com.www.model.*"%>
<%@ page import="com.www.config.*"%>
<%@ page import="com.www.service.*"%>
<%@ page import="com.bbzhu.util.*"%>
<%@ page import="com.bbzhu.system.*"%>
<%@ page import="com.bbzhu.database.*"%>
<%@ page import="java.util.*"%>
<%
	Admin admin = AuthService.findAdmin(request);
	if(admin == null || !admin.findRight(101)){
		out.print("权限不足");
		return;
	}
	
	String uname = Common.getValue("uname",request);
	StringBuffer sb = new StringBuffer(" 1=1");
	if(uname!=null&& !uname.isEmpty()){
		sb.append(" and name like '%" + uname + "%'");
	}
	List<Brand> list = Brand.findList(sb.toString(), Brand.class);
	
	//List<Brand> list = BrandCache.getList();
	ListPage listPage = new ListPage(request,50);
	listPage.init(list.size());
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="images/main.css" type="text/css">
		<script src="js/jquery-1.4.2.min.js"></script>
		<script src="js/jquery.validate.min.js"></script>
		<script src="js/jquery.metadata.js"></script>
		<script src="/editor/kindeditor.js"></script>
		<script src="js/main.js"></script>
		<script language="javascript">
			$(function(){
				$(".list tr:odd:not(:first)").addClass("odd");
				$(".del").click(function(){
					return window.confirm("确认删除么？");
				}); 
			});
		</script>
	</head>
	<body>
		<div class="maintitle"><b>★品牌管理</b></div>
		<form action="brandlist.jsp" method="post" id="form1">
		<table border="0" cellpadding="0" cellspacing="0" class="list">
			<tr>
				<td class="bar">当前位置：品牌列表
				<input name="uname" value="<%=uname %>"/>&nbsp;<input type="submit" value="查询" id="btn">
				 </td>
				<td class="add"><a href="addbrand.jsp">添加品牌</a></td>
			</tr>
		</table>
		</form>
		<table border="0" cellpadding="0" cellspacing="0" class="list">
			<tr class="listtitle">
				<td>序号</td>
				<td>名称</td>
				<td>删除</td>
			</tr>
			<%
				for(int i = listPage.getStartPos(); i < listPage.getEndPos(); i++){
					Brand obj = list.get(i);
			%>
			<%
			
			%>
			<tr>
				<td><%=i+1 %></td>
				<td><a href="editbrand.jsp?id=<%=obj.getId() %>&intPage=<%=listPage.getIntPage() %>"><%=obj.getName() %></a></td>
				<td><a href="Brand_del.do?id=<%=obj.getId() %>&intPage=<%=listPage.getIntPage() %>" class="del">删除</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<%	
			if(listPage.getPageCount() > 0){
		%>
		<table border="0" cellpadding="0" cellspacing="0" class="page">
			<tr>
				<td><%=listPage.buildSelPage("brandlist.jsp") %></td>
			</tr>
		</table>
		<%
			}
		%>
		<br>
	</body>
</html>
