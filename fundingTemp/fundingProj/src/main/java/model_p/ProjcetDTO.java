package model_p;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ProjcetDTO {
		String company,title,content,nickname,wname,cat;
		Date reg_date;
		int targetamount,price,personnel,cnt;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm:ss");
		
		public boolean isImg() {
			String pp = ".*[.](jpeg|jpg|bmp|png|gif|pdf)";	
			return (getWname()!=null && Pattern.matches(pp, getWname().toLowerCase())||getContent()!=null && Pattern.matches(pp, getContent().toLowerCase()));
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
//			if(getContent()!=null) {
//				try {
//					return URLEncoder.encode(content,"UTF-8");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			return null;
			return content;
		}
	
		public void setContent(String content) {
			this.content = content;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getWname() {
//			if(getWname()!=null) {
//				try {
//					return URLEncoder.encode(wname,"UTF-8");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			return null;
			return wname;
		}
		public void setWname(String wname) {
			this.wname = wname;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
		public Date getReg_date() {
			return reg_date;
		}
		public String getReg_dateStr() {
			return sdf.format(reg_date);
		}
		public void setReg_date(Date reg_date) {
			this.reg_date = reg_date;
		}
		public int getTargetamount() {
			return targetamount;
		}
		public void setTargetamount(int targetamount) {
			this.targetamount = targetamount;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPersonnel() {
			return personnel;
		}
		public void setPersonnel(int personnel) {
			this.personnel = personnel;
		}
		public int getCnt() {
			return cnt;
		}
		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
		@Override
		public String toString() {
			return "ProjcetDTO [company=" + company + ", title=" + title + ", content=" + content + ", nickname="
					+ nickname + ", wname=" + wname + ", cat=" + cat + ", reg_date=" + reg_date + ", targetamount="
					+ targetamount + ", price=" + price + ", personnel=" + personnel + ", cnt=" + cnt + "]";
		}
		
		
		
	
		
		
}
