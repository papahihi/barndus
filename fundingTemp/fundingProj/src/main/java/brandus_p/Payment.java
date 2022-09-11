package brandus_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;

public class Payment implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		String title = request.getParameter("title");
		System.out.println(title);
		request.setAttribute("mainUrl", "brandus/payment.jsp");
		
	}

}
