package project_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import di_p.FunService;

public class Logout implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//request.getSession().removeAttribute("nickname");
		
		request.getSession().invalidate();
		request.setAttribute("mainUrl", "funboard/alert.jsp");
		request.setAttribute("msg", "로그아웃");
		request.setAttribute("goUrl", request.getContextPath()+"/brandus/MainList");
		
	}

}
