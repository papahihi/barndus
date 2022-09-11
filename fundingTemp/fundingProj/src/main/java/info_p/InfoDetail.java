package info_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.AccountDTO;
import model_p.FunDAO;
import di_p.FunService;

   //funlist_p.InfoDetail
public class InfoDetail implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			request.setAttribute("mainUrl", "info/infoDetail.jsp");
			String nickname = (String)request.getSession().getAttribute("nickname");
			AccountDTO infoDtos = new FunDAO().infoDetail(nickname);
			request.setAttribute("infoDtos", infoDtos);
	}

}
