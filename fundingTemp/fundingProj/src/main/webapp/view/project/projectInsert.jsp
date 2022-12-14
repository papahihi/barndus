<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="../font/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../font/jquery-ui.min.js"></script>
<script type="text/javascript">
	$(function() {

		var titleArea = document.getElementById("title")
		var contentArea = document.getElementById("content")
		var wnameArea = document.getElementById("wname")
		var targetamountArea = document.getElementById("targetamount")
		var priceArea = document.getElementById("price")

		var pp = ".*[.](jpeg|jpg|bmp|png|gif|pdf)";
		$("input[type=submit]").click(function() {

			if (titleArea.value == "") {
				alert("제품명을 입력하세요.")
				return false
			}
			if (wnameArea.value == "") {

				alert("제품 소개의 사용할 사진을 확인해주세요.")
				return false
			}
			if (contentArea.value == "") {

				alert("첨부할 사진을 확인해주세요.")
				return false
			}

			if (targetamountArea.value == "") {
				alert("목표 금액을 입력해주세요.")
				return false
			}
			if (priceArea.value == "") {
				alert("제품 금액을 입력해주세요.")
				return false
			}

			return true
		})

	})
</script>


<form action="ProjectInsertReg" method="post"
	enctype="multipart/form-data">
	<div class="projectInsert">
		<p class="title">제품등록하기</p>

		<fieldset>
			<legend>회사명</legend>
			<input type="text" value="${ifDto.company }" name="company" readonly />
		</fieldset>

		<fieldset>
			<legend>제품명</legend>
			<input type="text" name="title" id="title" />
		</fieldset>

		<fieldset>
			<legend>닉네임</legend>
			<input type="text" value="${ifDto.nickname }" name="nickname" readonly />
		</fieldset>

		<fieldset>
			<legend>제품소개</legend>
			<input type="file" name="wname" id="wname" /> <span>사진만가능합니다.ex)
				jpeg, jpg, bmp, png, gif, pdf</span>
		</fieldset>

		<fieldset>
			<legend>제품자세히</legend>
			<input type="file" name="content" id="content" /> <span>사진만가능합니다.ex)
				jpeg, jpg, bmp, png, gif, pdf</span>
		</fieldset>

		<fieldset>
			<legend>목표금액</legend>
			<input type="text" name="targetamount" id="targetamount" />
		</fieldset>

		<fieldset>
			<legend>금액</legend>
			<input type="text" name="price" id="price" />
		</fieldset>

		<fieldset>
			<legend>카테고리</legend>
			<select name="cat">
				<option value="clothes">의류</option>
				<option value="bag">가방</option>
				<option value="medicine">약품</option>
			</select>
		</fieldset>

		<div class="buttonArea">
			<input type="submit" value="등록"> 
		</div>
	</div>
</form>