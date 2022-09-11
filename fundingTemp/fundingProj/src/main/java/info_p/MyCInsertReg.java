package info_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.CommunityDTO;
import model_p.FunDAO;

public class MyCInsertReg implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			
			String title = request.getParameter("title");
			String nickname = (String)request.getSession().getAttribute("nickname");
			System.out.println(title);
		
			String contentname = request.getParameter("contentname");
			String content = request.getParameter("content");
			
			CommunityDTO cinsert = new  CommunityDTO();
			cinsert.setTitle(title);
			cinsert.setNickname(nickname);
			cinsert.setContentname(contentname);
			cinsert.setContent(content);
			new FunDAO().cInsert(cinsert);
			
			request.setAttribute("mainUrl", "funboard/alert.jsp");
			request.setAttribute("goUrl", "MyInquiry?&title="+title);
			request.setAttribute("msg", "작성완료");
	}

}
