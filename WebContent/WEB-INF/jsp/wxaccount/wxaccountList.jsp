<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微信账号列表</title>
</head>
<body> 

微信账号列表：
<table width="100%" border=1>
<tr>
	<td>openid</td>
	<td>unionid</td>
	<td>微信网名</td>
	<td>性别</td>
	<td>省份</td>
</tr>
<c:forEach items="${wxaccountList }" var="item">
<tr>
	<td>${item.openid }</td>
	<td>${item.unionid }</td>
	<td>${item.nickname}</td>
	<td>${item.sex }</td>
	<td>${item.province}</td>
</tr>
</c:forEach>

</table>
</body>

</html>