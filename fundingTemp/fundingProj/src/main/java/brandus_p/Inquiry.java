package brandus_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.CommunityDTO;
import model_p.FunDAO;

public class Inquiry implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title =request.getParameter("title");	
		System.out.println(title);
		String mainUrl = "funboard/alert.jsp";
		String goUrl = request.getContextPath()+"/project/Login";
		String msg = "로그인 후 이용 가능합니다.";
		String nickname = (String) request.getSession().getAttribute("nickname");
		System.out.println(nickname);
		if(nickname!=null) {
			mainUrl = "brandus/inquiry.jsp";
		}
		ArrayList<CommunityDTO> cDto = new FunDAO().CList(title);
		request.setAttribute("cDto", cDto);
		request.setAttribute("title", title);
		request.setAttribute("mainUrl", mainUrl);
		request.setAttribute("msg", msg);
		request.setAttribute("goUrl", goUrl);
	}

}
