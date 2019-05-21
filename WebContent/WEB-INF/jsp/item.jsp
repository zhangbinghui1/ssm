<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	</tr>
	<c:forEach items="${itemlist}" var="o">
	<tr>
		<td>${o.name}</td>
	       <td>${o.price}</td>
	       <td><fmt:formatDate value="${o.createtime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
	<td>${o.detail}</td>
	
	</tr>
	</c:forEach>


</table>

</body>
</html>