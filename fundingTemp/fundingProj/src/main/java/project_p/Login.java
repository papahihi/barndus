package project_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import di_p.FunService;

public class Login implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainUrl", "project/login.jsp");
		
	
	}

}
