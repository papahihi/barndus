package info_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.FunDAO;
import model_p.ProFundingDTO;
import model_p.ProjcetDTO;
import di_p.FunService;

public class MyList implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
		
		String nickname = (String) request.getSession().getAttribute("nickname");
		ArrayList<ProjcetDTO> myList = new FunDAO().MyList(nickname);
		ArrayList<ProFundingDTO> myFunding = new FunDAO().myFundingDetail(nickname);
		
		request.setAttribute("myList", myList);
		request.setAttribute("myFunding", myFunding);
		request.setAttribute("mainUrl", "info/myList.jsp");


	}

}
