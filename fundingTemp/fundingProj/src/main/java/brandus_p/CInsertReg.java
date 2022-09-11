package brandus_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.CommunityDTO;
import model_p.FunDAO;

public class CInsertReg implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			
			String title = request.getParameter("title");
			String id = request.getParameter("id");
			String nickname = (String)request.getSession().getAttribute("nickname");
			System.out.println(title);
			System.out.println(id);
			String contentname = request.getParameter("contentname");
			String content = request.getParameter("content");
			System.out.println(nickname);
			CommunityDTO cinsert = new  CommunityDTO();
			cinsert.setTitle(title);
			cinsert.setNickname(nickname);
			cinsert.setContentname(contentname);
			cinsert.setContent(content);
			new FunDAO().cInsert(cinsert);
			
			request.setAttribute("mainUrl", "funboard/alert.jsp");
			request.setAttribute("goUrl", "Inquiry?id="+id+"&title="+title);
			request.setAttribute("msg", "작성완료");
	}

}
