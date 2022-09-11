package info_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.CommunityDTO;
import model_p.FunDAO;

public class MyCInsert implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			String title = request.getParameter("title");
			request.setAttribute("title",title);
			String id = request.getParameter("id");
			request.setAttribute("id",id);
			System.out.println(title);
			request.setAttribute("mainUrl", "info/myCInsert.jsp");
			
	}

}
