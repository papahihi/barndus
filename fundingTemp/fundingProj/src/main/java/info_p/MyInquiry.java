package info_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.CommunityDTO;
import model_p.FunDAO;
import di_p.FunService;

public class MyInquiry implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title =request.getParameter("title");

		System.out.println(title);

		ArrayList<CommunityDTO> cDto = new FunDAO().CList(title);
		request.setAttribute("cDto", cDto);
		request.setAttribute("title", title);
		request.setAttribute("mainUrl", "info/myInquiry.jsp");
	
	}

}
