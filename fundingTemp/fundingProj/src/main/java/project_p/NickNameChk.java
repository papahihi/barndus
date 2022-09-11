package project_p;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.AccountDTO;
import model_p.FunDAO;
import di_p.FunService;

public class NickNameChk implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String nickname = request.getParameter("nickname");
		
		int nicknameChk = new FunDAO().nickNameChk(nickname);
		
		System.out.println(nicknameChk);
		
	
		try {
			PrintWriter out = response.getWriter();
			out.write(nicknameChk+"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
