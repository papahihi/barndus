<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="CInsertReg">
	<input type = "hidden" name = "title" value="${title}">
	<div class="inquiryWrite">
		<p class="title">문의하기</p>
		<table class="tableBasic" border="">
			<colgroup>
				<col width="20%;" />
				<col width="auto" />
			</colgroup>
			<tr>
				<th>제목</th>
				<td> <input type = "text" name = "contentname"> </td>
			</tr>
			<tr>
				<th>문의사항</th>
				<td> <textarea rows="20" cols="50" name = "content"> </textarea></td>
			</tr>			
		</table>
		<div class="buttonArea">
			<input type = "submit" value ="작성"/>
			<a href = "Inquiry?title=${title }" >뒤로가기</a>
		</div>
	</div>
</form>
