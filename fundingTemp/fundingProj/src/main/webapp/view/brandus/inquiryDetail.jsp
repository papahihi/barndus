<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="inquirydetail">
	<table class="tableBasic" border="">
		<tr>
			<th>제목</th>
			<td colspan="5">${inDto.contentnameBr }</td>
		</tr>
		<tr>
			<th>제품명</th>
			<td>${inDto.title}</td>
			<th>글쓴이</th>
			<td>${inDto.nickname}</td>
			<th>날짜</th>
			<td>${inDto.reg_dateStr }</td>
		</tr>
		<tr>
			<th>문의내용</th>
			<td colspan="5">${inDto.contentBr }</td>
		</tr>
	</table>
	
	<div class="buttonArea">
		<a href = "Inquiry?id=${id }&cid=${inDto.cid }&title=${title}">뒤로가기</a>
	</div>
</div>