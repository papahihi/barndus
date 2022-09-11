<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="../font/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../font/jquery-ui.min.js"></script>
<script type="text/javascript">
	$(function() {

		$("#member").on("click", function() {
			location.href = "MemberShip";
		})

		$("#back").on("click", function() {
			location.href = "<c:url value ="/funding/"/>MainList"

		})
	})
</script>
<c:choose>
	<c:when test="${email==null }">
		<div class="loginArea">
			<form action="<c:url value="/project/"/>LoginReg">
				<fieldset>
					<legend>이메일</legend>
					<label><input type="text" id="email" name="email" /></label>
				</fieldset>
				<fieldset>
					<legend>비밀번호</legend>
					<label><input type="password" id="pw" name="pw" /></label>
				</fieldset>
				<div class="buttonArea">
					<input type="submit" value="로그인" /> 
					<input type="button" id="member" value="회원가입" />
				</div>				
			</form>
		</div>
	</c:when>
	<c:otherwise>
		<div class="loginArea">
			<form action="LoginReg">
				<fieldset>
					<legend>이메일</legend>
	
					<label><input type="text" id="email" name="email" /></label>
				</fieldset>
				<fieldset>
					<legend>비밀번호</legend>
					<label><input type="password" id="pw" name="pw" /></label>
				</fieldset>
				<input type="submit" value="로그인" />
				<input type="button" id="member" value="회원가입" />
			</form>
		</div>
	</c:otherwise>
</c:choose>