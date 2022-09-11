package info_p;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.AccountDTO;
import model_p.FunDAO;
import di_p.FunService;

public class InfoReg implements FunService{

	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String nickname = request.getParameter("nickname");
		String company = request.getParameter("company");
		AccountDTO dto = new AccountDTO();
		dto.setName(request.getParameter("name"));
		dto.setAddr(request.getParameter("addr"));
		dto.setPhnum(request.getParameter("phnum"));
		dto.setBankacc(request.getParameter("bankacc"));
		dto.setCompany(company);
		dto.setNickname(nickname);
		int cnt = new FunDAO().infoModify(dto);
		String msg = "수정 실패";
		String mainUrl = "InfoDetail?nickname="+nickname;
		if(cnt>0) {
			msg = "수정완료";
			request.getSession().setAttribute("company",company);
			mainUrl = "funboard/alert.jsp";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("mainUrl", mainUrl);
		request.setAttribute("goUrl", "InfoDetail?nickname="+nickname);
	}
}


