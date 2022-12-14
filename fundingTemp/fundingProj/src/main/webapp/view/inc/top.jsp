<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="topWrapper">
	<div class="gnbWrap">
		<ul class="gnbList">
			<li class="gnbItem"><a href="MainList"><img alt="" src="../img/title.png"> </a></li>
			<li class="gnbItem"><a href="<c:url value="/project/"/>ProjectInsert"><img alt="" src="../img/funding.png"> </a></li>
		</ul>
		<c:choose>
			<c:when test="${nickname!=null}">				
					<ul class="myMenuList">
						<li class="myMenuItem"><strong>${nickname}님</strong> 안녕하세요.</li>
						<li class="myMenuItem"><a href="<c:url value="/info/"/>InfoDetail">상세정보</a></li>
						<li class="myMenuItem"><a href="<c:url value="/project/"/>Logout">로그아웃 </a></li>
					</ul>
				
			</c:when>
			<c:otherwise>
				<ul class="myMenuList">
					<li class="myMenuItem"><a href="<c:url value="/project/"/>Login">로그인</a></li>
					<li class="myMenuItem"><a href="<c:url value="/project/"/>MemberShip"> 회원가입 </a></li>
				</ul>
			</c:otherwise>
		</c:choose>
	</div>
<c:choose>
	<c:when test="${title != null}"></c:when>
	<c:otherwise>
	<ul class="categoryList">
		
		<li class="categoryItem"><a href="MainList"><img alt="" src="../img/all.png"></a></li>
		<li class="categoryItem"><a href="MainList?cat=clothes"><img alt="" src="../img/clothes.png"></a></li>
		<li class="categoryItem"><a href="MainList?cat=bag"><img alt="" src="../img/bag.png"></a></li>
		<li class="categoryItem"><a href="MainList?cat=medicine"><img alt="" src="../img/medicine.png"></a></li>
	</ul>
	</c:otherwise>
</c:choose>
</div>
