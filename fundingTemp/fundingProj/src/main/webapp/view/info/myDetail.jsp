<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<% String nickname = (String)request.getSession().getAttribute("nickname"); 

%>

<script type="text/javascript">
	$(function() {
		$("#perBtn").on("click", function() {
			if(<%=nickname !=null%>){
			$("#per").css('display', 'block')				
			}else{
				alert("로그인 후 이용 가능합니다.")
			}
		})
	})
	
	$(function() {
		var num = parseInt($("#perText").val());
		var pp = parseInt($("#pp").val());
	
		var price = pp;
		$("#plus").on("click", function(e) {
			num = num + 1;
			price = num * pp
			$('input[name=personnel]').attr('value', num)
			$('input[name=price]').attr('value', price)
			console.log(price)
			e.preventDefault()
		})

		$("#minus").on("click", function(e) {
			if (num > 0) {
				num = num - 1;
				price = num * pp
				console.log(price)
				$('input[name=personnel]').attr('value', num)
				$('input[name=price]').attr('value', price)
			} else {
				price = num * pp
				console.log(price)
				num = 0;

				$('input[name=personnel]').attr('value', num)
				$('input[name=price]').attr('value', price)
			}
			
			e.preventDefault()
			
			
		})

	})
	
	

	
</script>
<div class="productDetail">
	<table class="tableBasic" border="">
		<colgroup>
			<col width="200px" />
			<col width="auto" />
		</colgroup>
		<tr>
			<th>회사명</th>
			<td>${dto.company}</td>
		</tr>
		<tr>
			<th id = "title">제품명</th>
			<td>${dto.title }</td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td>${dto.nickname }</td>
		</tr>
		<tr>
			<th>제품소개</th>
			<td>${dto.wname }</td>
		</tr>
		<tr>
			<th>소개</th>
			<td>${dto.content }
		</tr>
		<tr>
			<th>목표금액</th>
			<td>${dto.targetamount }</td>
		</tr>
		<tr>
			<th>가격</th>
			<td>${dto.price }</td>
		</tr>
		<tr>
			<th>현재모금액</th>
			<td>${dto.price*dto.personnel }</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td>${dto.reg_dateStr }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${dto.cnt }</td>
		</tr>	
	</table>
			<div class="buttonArea">
				<a href="MyInquiry?title=${dto.title }">문의</a>
				<button id="perBtn">구매</button> 
				<a href="MyList">뒤로가기</a> 
			</div>
	<form action="Payment">
		<div id="per">
			<div class="amountArea">	
				<fieldset>		
					<legend>수량</legend>
					<input type="text" id="perText" name="personnel" value="1" readonly />
					<button id="plus">+</button>
					<button id="minus">-</button>	
				</fieldset>
				<fieldset>	
					<legend>가격</legend>
					<input type="text" id="pp" name="price" value="${dto.price }" readonly />
					<input type="text"  name="title" value="${dto.title }" hidden />
				</fieldset>			
			</div>
			<div class="buttonArea">
				<input type="submit" id = "payment" value ="결제" />
			</div>		
		</div>	
	</form>
</div>

    