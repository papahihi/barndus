package project_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import di_p.FunService;
import model_p.AccountDTO;
import model_p.FunDAO;


public class ProjectInsert implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String mainUrl = "funboard/alert.jsp";
		String goUrl = "Login";
		String msg = "로그인 후 이용 가능합니다.";
		String nickname = (String) request.getSession().getAttribute("nickname");
		System.out.println(nickname);
		AccountDTO dto = new FunDAO().detailFunding(nickname);
		if(nickname!=null) {
			mainUrl = "project/projectInsert.jsp";
		}
		
		request.setAttribute("ifDto", dto);
		request.setAttribute("mainUrl", mainUrl);
		request.setAttribute("msg", msg);
		request.setAttribute("goUrl", goUrl);
		

	}

}
