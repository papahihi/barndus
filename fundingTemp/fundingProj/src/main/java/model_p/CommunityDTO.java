package model_p;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommunityDTO {
	int cid;
	String title,nickname,contentname,content;
	Date reg_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm:ss");
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContentname() {
		return contentname;
	}
	public String getContentnameBr() {
		return contentname.replaceAll("\n", "<br>");
	}
	public void setContentname(String contentname) {
		this.contentname = contentname;
	}
	public String getContent() {
		return content;
	}
	public String getContentBr() {
		return content.replaceAll("\n", "<br>");
	}
	public void setContent(String content) {
		this.content = content;
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
	@Override
	public String toString() {
		return "CommunityDTO [cid=" + cid  + ", title=" + title + ", nickname=" + nickname
				+ ", contentname=" + contentname + ", content=" + content + ", reg_date=" + reg_date + "]";
	}
	
	
}
