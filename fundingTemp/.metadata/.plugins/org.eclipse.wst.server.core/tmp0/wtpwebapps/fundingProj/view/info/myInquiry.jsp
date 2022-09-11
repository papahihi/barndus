<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="inquiryList">
		<table class="tableBasic" border="">
			<colgroup>
				<col width="10%" />
				<col width="auto" />
				<col width="20%" />
				<col width="20%" />
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>			
				<th>제품명</th>	
				<th>닉네임</th>		
				<th>날짜</th>
			</tr>
	<c:forEach items="${cDto }" var = "cd" varStatus="no">
			<tr>
				<td class="center">${no.index+1}</td>
				<td><a href ="MyInquiryDetail?id=${id }&cid=${cd.cid }&title=${title}">${cd.contentnameBr }</a></td>
				<td class="center">${title}</td>
				<td class="center">${cd.nickname}</td>
				<td class="center">${cd.reg_dateStr }</td>
			</tr>
	</c:forEach>			
		</table>
		
		<div class="buttonArea">
			<a href = "MyCInsert?title=${title }"> 문의하기</a>
			<a href = "MyDetail?title=${title }"> 뒤로가기</a>			
		</div>
	</div>
