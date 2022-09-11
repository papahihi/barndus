<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="myFundingList">

<fieldset>
	<legend>나의 펀딩리스트</legend>
	<table class="tableBasic" border="">
	<colgroup>
		<col width="auto" />
		<col width="20%" />
		<col width="10%" />
	</colgroup>
	<tr>		
		<th>제품명</th>
		<th>가격</th>
		<th>수량</th>	
	</tr>
<c:forEach items="${myFunding }" var ="myF" varStatus="no">
	<tr>
		<td class="center"><a href ="MyDetail?title=${myF.title}"> ${myF.title}</a> </td>
		<td class="center">${myF.price}</td>
		<td class="center">${myF.personnel}</td>
		
	</tr>
</c:forEach>
</table>
</fieldset>

<fieldset>
	<legend>나의 프로젝트</legend>

<table class="tableBasic" border="">
	<colgroup>
		<col width="10%" />
		<col width="10%" />
		<col width="10%" />
		<col width="auto" />
		<col width="10%" />
		<col width="15%" />
		<col width="10%" />
	</colgroup>
	<tr>
		<td class="center">회사명</td>
		<td class="center">제품명</td>
		<td class="center">닉네임</td>
		<td class="center">소개</td>
		<td class="center">카테고리</td>
		<td class="center">날짜</td>
		<td class="center">조회수</td>
	</tr>
<c:forEach items="${myList }" var ="dto" varStatus="no">
	<tr>
		<td class="center">${dto.company}</td>
		<td class="center"> <a href ="MyDetail?title=${dto.title}">${dto.title}</a> </td>
		<td class="center">${dto.nickname}</td>
		<td class="center">${dto.content}</td>
		<td class="center">${dto.cat}</td>
		<td class="center">${dto.reg_dateStr}</td>
		<td class="center">${dto.cnt}</td>
	</tr>
</c:forEach>
</table>
</fieldset>
</div>