package project_p;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model_p.FunDAO;
import model_p.ProjcetDTO;
import di_p.FunService;

public class ProjectInsertReg implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
		

		String path = "D:\\program\\fundingTemp\\fundingProj\\src\\main\\webapp\\listimg";
		int size =1024 *1024*10;	
		try { 
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					size,
					"UTF-8",
					new DefaultFileRenamePolicy());
			
		ProjcetDTO dto = new ProjcetDTO();
		dto.setCompany(mr.getParameter("company"));
		dto.setTitle(mr.getParameter("title"));
		dto.setNickname(mr.getParameter("nickname"));
		dto.setContent(mr.getFilesystemName("content"));
		dto.setWname(mr.getFilesystemName("wname"));
		dto.setTargetamount(Integer.parseInt(mr.getParameter("targetamount")));
		dto.setPrice(Integer.parseInt(mr.getParameter("price")));
		dto.setCat(mr.getParameter("cat"));
		new FunDAO().projectInsert(dto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = "등록 완료";
		String mainUrl = "funboard/alert.jsp";
		String goUrl = request.getContextPath()+"/brandus/MainList";
		request.setAttribute("mainUrl", mainUrl);
		request.setAttribute("msg", msg);
		request.setAttribute("goUrl", goUrl);

	}

}
