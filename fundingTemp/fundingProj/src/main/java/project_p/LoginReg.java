package project_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.AccountDTO;
import model_p.FunDAO;
import di_p.FunService;

public class LoginReg implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String company = request.getParameter("company");
			AccountDTO acc = new FunDAO().loginChk(email,pw);
			String msg = "로그인 완료";
			String mainUrl = "funboard/alert.jsp";
			String goUrl = request.getContextPath()+"/brandus/MainList";
			System.out.println(email+","+pw);
			
			
			if(acc!=null) {
				request.getSession().setAttribute("nickname", acc.getNickname());
			
			
				System.out.println(email+","+pw);
			}else {
				msg = "아이디와 비밀번호를 확인하세요";
				goUrl = "Login";
			}
			
			
			request.setAttribute("mainUrl", mainUrl);
			request.setAttribute("msg", msg);
			request.setAttribute("goUrl", goUrl);
		
	}

}
