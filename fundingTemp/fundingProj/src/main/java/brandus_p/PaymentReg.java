package brandus_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di_p.FunService;
import model_p.FunDAO;
import model_p.ProFundingDTO;

public class PaymentReg implements FunService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
				String title =	request.getParameter("title");
				String nickname = (String)request.getSession().getAttribute("nickname");
				int price =	Integer.parseInt(request.getParameter("price"));
				int personnel =	  Integer.parseInt(request.getParameter("personnel"));
				System.out.println(personnel+","+price+","+title);
				ProFundingDTO dto = new ProFundingDTO();
				dto.setNickname(nickname);
				dto.setTitle(title);
				dto.setPrice(price);
				dto.setPersonnel(personnel);
				new FunDAO().funInsert(dto);
				new FunDAO().addFunding(personnel, title);
				request.setAttribute("mainUrl", "funboard/alert.jsp");
				request.setAttribute("goUrl","MainList");
				request.setAttribute("msg", "구매 되었습니다.");
	}

}
