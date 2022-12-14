<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
#emailChk {
	display: none;
}
</style>
<script type="text/javascript" src="../font/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../font/jquery-ui.min.js"></script>
<script type="text/javascript">
	 var resCode = ""; 
	 var resText = "인증완료";
	 var res = 0;
	 
	$(function() {

		var email_Area = document.getElementById("email")
		var emailCerti_Area = document.getElementById("emailCerti")
		var emailCertiChk_Area = document.getElementById("emailCertiChk")
		var emailChk = $("#emailCertiChk").val()
		var pw_Area = document.getElementById("pw")
		var pw2_Area = document.getElementById("pw2")
		var nickname_Area = document.getElementById("nickname")
		var nickname_Chk = document.getElementById("chkNickname").value
		var pw_Chk = /^[a-zA-z0-9]{8,16}$/
		
		$("#btn").click(function() {
		
			email_Area.value = "";
			pw_Area.value = "";
			pw2_Area.value = "";
			nickname_Area.value = "";

			alert("초기화완료")
		})

		
		$("#chkbutton").click(function() {
			console.log($("#nickname").val())
			var nickname = $("#nickname").val();
			$.ajax({
				url : "<c:url value="/ajax/"/>NickNameChk", //요청 url설정
				type : "post", // GET/POST설정 
				data : {
					nickname : nickname
				}, // 요청 매개변수 설정
				// 			dataType :'json',
				success : function(result) {
					//alert(result)
					if (result == '0') {
						$("#chkNickname").html("중복된 닉네임 입니다.")
						$("#chkNickname").css('color', '#f00')	
						// 					nickname_Chk.value("중복된 닉네임 입니다.")
						$("input[type=submit]").attr("disabled", true);


					} else {
						$("#chkNickname").html("사용 가능한 닉네임 입니다.")
 						$("#chkNickname").css('color', '#00f')	
						// 					nickname_Chk.value("사용 가능한 닉네임 입니다.")
						$("input[type=submit]").attr("disabled", false);

					}

				},
				error : function() {
					alert("서버요청 실패");
				}
			})

		})

		$("#certiBtn").on("click", function(e) {
			console.log($("#email").val())
			var email = $("#email").val();
			$.ajax({
				url : "<c:url value="/ajax/"/>EmailChk", //요청 url설정
				type : "post", // GET/POST설정 
				data : {
					email : email
				}, // 요청 매개변수 설정
				// 			dataType :'json',
				success : function(result) {
					//alert(result)
					if (result == '0') {
						resCode = ""
						alert("중복된 이메일입니다.")
					} else {
						console.log(result);
						resCode = result
						alert("인증코드가 발송되었습니다 확인해 주세요")
						$("#emailChk").css('display', 'block')
						
						
					}

				},
				error : function() {
					alert("서버요청 실패");
				}
			})

		})
 		$("#certiChk").on("click",function(){
 			

 			console.log(emailCerti_Area.value)
 			console.log(resCode)
 			if(emailCerti_Area.value==resCode){
 				resText = "인증완료";
 				$("#emailCertiChk").css('color', '#00f')		
 			console.log(emailCertiChk_Area.value)
 				res = 1;
 			
 			}else{
 				resText ="인증실패";
 				$("#emailCertiChk").css('color', '#f00')	
 				res = 0;
 				
 		
 			}
 			
 				$("#emailCertiChk").html(resText)
 				console.log(res)
	 			
 		})
 		
		$("#back").on("click", function() {
			location.href = "<c:url value="/brandus/"/>MainList"

		})
		$("input[type=submit]").click(function() {
			
			if (email_Area.value == "") {
				alert("이메일을 입력하세요.")
				return false
			}

			if (pw_Area.value == "") {

				alert("비밀번호를 입력하세요.")
				return false
			}
			if (pw2_Area.value == "") {

				alert("비밀번호 확인을 입력하세요.")
				return false
			}
			if (pw_Chk.test(pw_Area.value) == false) {
				alert("비밀번호 형식이 맞지않습니다.")
				return false

			}
			if (pw_Area.value != pw2_Area.value) {
				alert("비밀번호가 일치하지않습니다.")
				return false
			}
			if (nickname_Area.value == "") {

				alert("닉네임을 입력하세요.")
				return false
			}
		
			
			if (res != 1){
				alert("인증번호를 확인하세요.")
 				return false
 			}
 			

			return true
		})

	})
</script>

<form action="MemberShipReg" class="memberArea">
<h1>회원가입</h1>

	<fieldset>
		<legend>이메일</legend>
		<label><input type="text" id="email" name="email" /></label> 
		<div  class = "buttonArea"> <input	type="button" id="certiBtn" value="인증번호 받기" /> </div>
	</fieldset>

	<fieldset id="emailChk">
		<legend>이메일 인증 번호 입력</legend>
		<input type="text" id="emailCerti" name="emailCerti" />
		<span id="emailCertiChk" >인증번호를 입력하세요.</span>
	<div  class = "buttonArea">	<input type="button" id="certiChk" value="인증번호 확인" /> </div>
	</fieldset>

	<fieldset>
		<legend>비밀번호</legend>
		<input type="password" id="pw" name="pw" />
	</fieldset>

	<fieldset>
		<legend>비밀번호 확인</legend>
		<input type="password" id="pw2" name="pw2" />
	</fieldset>

	<fieldset>
		<legend>닉네임</legend>
		<input type="text" id="nickname" name="nickname" /> 
		<span id="chkNickname" ></span>
		<div  class = "buttonArea">	<input type="button" id="chkbutton" value="중복체크" /></div>
	</fieldset>

	<div  class = "buttonArea">
		 <input type="button" id="btn" value="초기화"  />
		 <input type="submit" id="btn2" value="가입하기" /> 
		<input type="button" id="back" value="뒤로가기" />
	</div>


</form>
