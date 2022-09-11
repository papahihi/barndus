package project_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.AccountDTO;
import model_p.FunDAO;
import di_p.FunService;

public class MemberShipReg implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			String msg = "";	
			String goUrl ="";

			String email = request.getParameter("email");
			String pw =	request.getParameter("pw");
			String nickname = request.getParameter("nickname");
			
			
			
			AccountDTO dto = new AccountDTO();
					dto.setEmail(email);
					dto.setPw(pw);
					dto.setNickname(nickname);
					new FunDAO().insert(dto);
			
		
			
//		 	String tel_Check = /^010([0-9]{4})([0-9]{4})$/
//		 	String jumin_Check = /^([0-9]{6})([0-9]{7})$/
			
	
			msg = "회원가입 완료";
			goUrl = request.getContextPath()+"/brandus/MainList";
			
	


	

	request.setAttribute("msg", msg);
	request.setAttribute("mainUrl", "funboard/alert.jsp");
	request.setAttribute("goUrl", goUrl);
	
	
	
	}
	

}
