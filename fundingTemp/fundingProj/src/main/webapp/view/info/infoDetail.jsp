<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="<c:url value="/info/"/>InfoReg">
	<div class="myInfoArea">
		<fieldset>
			<legend>이메일</legend>
			<input type="text" value="${infoDtos.email }" readonly />
		</fieldset>
		<fieldset>
			<legend>비밀번호</legend>
			<input type="text" value="${infoDtos.pw }" readonly />
		</fieldset>
		<fieldset>
			<legend>이름</legend>
			<input type="text" value="${infoDtos.name }" name="name" />
		</fieldset>
		<fieldset>
			<legend>닉네임</legend>
			<input type="text" value="${infoDtos.nickname }" name="nickname"
				readonly />
		</fieldset>
		<fieldset>
			<legend>주소</legend>
			<input type="text" value="${infoDtos.addr }" name="addr" />
		</fieldset>
		<fieldset>
			<legend>전화번호</legend>
			<input type="text" value="${infoDtos.phnum }" name="phnum" />
		</fieldset>
		<fieldset>
			<legend>계좌번호</legend>
			<input type="text" value="${infoDtos.bankacc }" name="bankacc" />
		</fieldset>
		<fieldset>
			<legend>회사이름</legend>
			<input type="text" value="${infoDtos.company }" name="company" />
		</fieldset>
		<div class="buttonArea">
			<input type="submit" value="수정하기" /> 
			<a href="<c:url value="/brandus/"/>MainList">뒤로가기</a>
		</div>	
	</div>
</form>