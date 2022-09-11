<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/common.css" />
<script type="text/javascript" src="../font/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../font/jquery-ui.min.js"></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
</head>
<body>
<div id = "warpper">
	<div id ="header"><jsp:include page="inc/proTop.jsp"/> </div>
	<div id ="content"><jsp:include page="${mainUrl}"/>  </div>
</div>
</body>
</html>