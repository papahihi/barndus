package brandus_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.CommunityDTO;
import model_p.FunDAO;
import model_p.ProjcetDTO;

public class InquiryDetail implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String id = request.getParameter("id");
		System.out.println(cid);
		String title = request.getParameter("title");

		System.out.println(title);
		CommunityDTO inDto = new FunDAO().InDetail(cid);
		System.out.println(inDto);

		request.setAttribute("mainUrl", "brandus/inquiryDetail.jsp");
		request.setAttribute("inDto", inDto);
		request.setAttribute("cid", cid);
		request.setAttribute("id", id);
		request.setAttribute("title", title);

	}

}
