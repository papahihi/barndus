<%@page import="model_p.FunDAO"%>
<%@page import="model_p.ProjcetDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript" src="../font/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../font/jquery-ui.min.js"></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript">


		var IMP = window.IMP
		IMP.init('imp82843484') // 가맹점식별코드
// 		IMP.request_pay(param.callback)// 결제창 호출
		
		IMP.request_pay({
		pg : 'kakaopay',
		pay_method : 'card',
		merchant_uid : 'merchant_'+new Date().getTime(),
		name : '${param.title}',
		amount : ${param.price},
		buyer_email : 'dbghjs@naver.com',
		buyer_name : '${nickname}',
		buyer_tel : '010-9324-7106',
		buyer_addr : '인천광역시 계양구 작전동',
		buyer_postcode : '123-456'
		
			
		},function(rsp){
			if(rsp.success){
				console.log("결제된다~");
		
				$('#success').submit();
				
			}else{
				var msg = '결제에 실패하였습니다.\n';
				msg += rsp.error_msg;
				alert(msg);
				location.href="Detail?title=${param.title }"

				return false;
			}
			
		});
</script>
<form action="PaymentReg" id="success">
<input type = "text" value = "${param.title }"  name = "title" hidden/> 
<input type = "text" value = "${param.price}" name = "price" hidden/> 
<input type = "text" value ="${param.personnel }"  name = "personnel"  hidden/> 


<input type="submit"  id = "payment" hidden/></form>


