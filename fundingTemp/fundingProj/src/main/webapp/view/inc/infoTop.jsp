<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div id="topWrapper">
	<div class="gnbWrap">
		<ul class="gnbList">
			<li class="gnbItem"><a href="<c:url value="/brandus/"/>MainList"><img alt="" src="../img/title.png"> </a></li>
			<li class="gnbItem"><a href="<c:url value="/project/"/>ProjectInsert">프로젝트</a></li>
		</ul>
		<ul class="myMenuList">
			<li class="myMenuItem"><strong>${nickname}님</strong> 안녕하세요.</li>
			<li class="myMenuItem"><a href="<c:url value="/info/"/>InfoDetail">상세정보</a></li>
			<li class="myMenuItem"><a href="<c:url value="/info/"/>MyList">나의 프로젝트</a></li>
			<li class="myMenuItem"><a href="<c:url value="/project/"/>Logout">로그아웃 </a></li>
			
		</ul>
	</div>
</div>
