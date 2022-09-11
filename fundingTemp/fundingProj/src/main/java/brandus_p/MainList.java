package brandus_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.FunDAO;
import model_p.ProjcetDTO;


public class MainList implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String cat = request.getParameter("cat");
		
		System.out.println(cat);
		ArrayList<ProjcetDTO> mainList;
		
		if(cat != null) {
			mainList = new FunDAO().cateList(cat);
			System.out.println(mainList);
		}else {
			mainList = new FunDAO().PList();
		}
		request.setAttribute("mainUrl", "brandus/mainList.jsp");
		request.setAttribute("mainList", mainList);
		request.getSession().setAttribute("cat", cat);
		
	}

}
