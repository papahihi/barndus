package brandus_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.AccountDTO;
import model_p.FunDAO;
import model_p.ProjcetDTO;

public class Detail implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		String nickname = (String) request.getSession().getAttribute("nickname");
		System.out.println(nickname);
		System.out.println(title);
		
		FunDAO dao = new FunDAO();
		dao.addCnt(title);
		
		ProjcetDTO dto = dao.detail(title);
		System.out.println(dto);
//		AccountDTO pList = dao.infoDetail(nickname);
//		System.out.println(pList);
//		AccountDTO pList = dao.infoDetail(nickname);
//		request.setAttribute("buyer_email", pList.getEmail());
//		request.setAttribute("buyer_name", pList.getName());
//		request.setAttribute("buyer_phnum", pList.getPhnum());
//		request.setAttribute("buyer_email", pList.getEmail());
//		request.setAttribute("buyer_email", pList.getEmail());
		request.setAttribute("dto", dto);
		request.setAttribute("title", title);
		request.setAttribute("nickname", nickname);
//		request.setAttribute("personnel", dto.getPersonnel());
//		System.out.println(dto.getPersonnel());
		request.setAttribute("mainUrl", "brandus/detail.jsp");
	
	}	

}
