package project_p;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import di_p.FunService;

import model_p.FunDAO;

public class EmailChk implements FunService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		System.out.println(email);
		int chk = new FunDAO().emailChk(email);
		System.out.println(chk);
		String host = "smtp.gmail.com";
		String user = "paradxc23@gmail.com";
		String password = "zfrsxhtixcqkjwii";
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.port","587");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		

		StringBuffer temp = new StringBuffer();
		Random ran = new Random();
		for (int i = 0; i < 6; i++) {
			int rIndex = ran.nextInt(3);
			switch (rIndex) {
			case 0:

				temp.append((ran.nextInt(9)+1));
				break;
			case 1:

				temp.append((ran.nextInt(10)));
				break;
			case 2:

				temp.append((ran.nextInt(10)));
				break;
			}
		}
		String AuthenticationKey = temp.toString();
		System.out.println(AuthenticationKey);
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		MimeMessage msg = new MimeMessage(session);

		try {
			// 편지보낸시간
			msg.setSentDate(new Date());
			InternetAddress from = new InternetAddress();
			from = new InternetAddress(user,"Brandus"); // 발신자 아이디
			// 이메일 발신자
			msg.setFrom(from);
			// 이메일 수신자
			InternetAddress to = new InternetAddress(email);
			
			msg.setRecipient(Message.RecipientType.TO, to);
			// 이메일 제목
			msg.setSubject("Brandus 회원 가입 인증 번호입니다.", "UTF-8");
			// 이메일 내용
			msg.setText("인증번호는:"+temp+"입니다.", "UTF-8");
			// 이메일 헤더
			msg.setHeader("content-Type", "text/html");
			// 메일보내기
			javax.mail.Transport.send(msg, msg.getAllRecipients());

		} catch (AddressException addr_e) {
			addr_e.printStackTrace();
		} catch (MessagingException msg_e) {
			msg_e.printStackTrace();
		} catch (Exception msg_e) {
			msg_e.printStackTrace();
		
		}

		try {
			PrintWriter out = response.getWriter();
			if (chk == 1) {
				chk = Integer.parseInt(AuthenticationKey);
			}

			out.write(chk + "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
