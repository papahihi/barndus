package info_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.FunDAO;
import model_p.ProjcetDTO;
import di_p.FunService;
public class MyDetail implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		
		System.out.println(title);
		
		FunDAO dao = new FunDAO();
		dao.addCnt(title);
		
		ProjcetDTO dto = dao.detail(title);
		
		request.setAttribute("dto", dto);
		request.setAttribute("title", title);
		
		request.setAttribute("mainUrl", "info/myDetail.jsp");
	}

}
