package model_p;

public class ProFundingDTO {
	String title, nickname;
	int price,personnel;
	
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
	@Override
	public String toString() {
		return "ProFundingDTO [title=" + title + ", nickname=" + nickname + ", price=" + price + ", personnel="
				+ personnel + "]";
	}
	
	
}
