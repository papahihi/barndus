package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class FunDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;

	public FunDAO() {

		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/funuser");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int infoModify(AccountDTO dto) {
		sql = "update account set name = ?, addr = ?, phnum = ?, bankacc = ?, company = ? where nickname = ? ";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.name);
			ptmt.setString(2, dto.addr);
			ptmt.setString(3, dto.phnum);
			ptmt.setString(4, dto.bankacc);
			ptmt.setString(5, dto.company);
			ptmt.setString(6, dto.nickname);
			return ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}

	public AccountDTO infoDetail(String nickname) {
		AccountDTO dto = null;
		sql = "select * from account where nickname = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nickname);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				dto = new AccountDTO();
				dto.setId(rs.getInt("id"));
				dto.setEmail(rs.getString("email"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setNickname(rs.getString("nickname"));
				dto.setAddr(rs.getString("addr"));
				dto.setPhnum(rs.getString("phnum"));
				dto.setBankacc(rs.getString("bankacc"));
				dto.setCompany(rs.getString("company"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;

	}

	public void insert(AccountDTO dto) {
		sql = "insert into account(email,pw,nickname)" + "values(?,?,?)";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.email);
			ptmt.setString(2, dto.pw);
			ptmt.setString(3, dto.nickname);
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public AccountDTO loginChk(String email, String pw) {
		sql = "select * from account where email = ? AND pw = ? ";
		AccountDTO dto = null;
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, email);
			ptmt.setString(2, pw);
			rs = ptmt.executeQuery();

			if (rs.next()) {
				dto = new AccountDTO();
				dto.setEmail(rs.getString("email"));
				dto.setPw(rs.getString("pw"));
				dto.setNickname(rs.getString("nickname"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;

	}

	public int nickNameChk(String nickname) {
		sql = "select nickname from account where nickname = ?  ";
		int idCheck = 0;

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nickname);

			rs = ptmt.executeQuery();

			if (rs.next() || nickname.equals("")) {
				idCheck = 0;
			} else {
				idCheck = 1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return idCheck;

	}

	public int emailChk(String email) {
		sql = "select email from account where email = ?  ";
		int idCheck = 1;

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, email);

			rs = ptmt.executeQuery();

			if (rs.next()) {
				idCheck = 0;
			} else {
				idCheck = 1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return idCheck;

	}

	public ArrayList<ProjcetDTO> PList() {
		ArrayList<ProjcetDTO> res = new ArrayList<ProjcetDTO>();
		sql = "select * from project";
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while (rs.next()) {
				ProjcetDTO dto = new ProjcetDTO();
				dto = new ProjcetDTO();
				dto.setCompany(rs.getString("company"));
				dto.setTitle(rs.getString("title"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContent(rs.getString("content"));
				dto.setTargetamount(rs.getInt("targetamount"));
				dto.setWname(rs.getString("wname"));
				dto.setPrice(rs.getInt("price"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setCat(rs.getString("cat"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public void addCnt(String title) {
		sql = "update project set cnt = cnt + 1 where title = ?";

		try {

			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			ptmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ProjcetDTO detail(String title) {
		ProjcetDTO dto = null;
		sql = "select * from project where title = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);

			rs = ptmt.executeQuery();
			if (rs.next()) {
				dto = new ProjcetDTO();
				dto.setCompany(rs.getString("company"));
				dto.setTitle(rs.getString("title"));
				dto.setNickname(rs.getString("nickname"));
				dto.setWname(rs.getString("wname"));
				dto.setContent(rs.getString("content"));
				dto.setTargetamount(rs.getInt("targetamount"));
				dto.setPrice(rs.getInt("price"));
				dto.setPersonnel(rs.getInt("personnel"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setCat(rs.getString("cat"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}
	public AccountDTO detailFunding(String nickname) {
		AccountDTO dto = null;
		sql = "select * from account where nickname = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nickname);

			rs = ptmt.executeQuery();
			if (rs.next()) {
				dto = new AccountDTO();
				dto.setCompany(rs.getString("company"));
				dto.setNickname(rs.getString("nickname"));
			

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}


	public ArrayList<ProjcetDTO> cateList(String cat) {
		ArrayList<ProjcetDTO> res = new ArrayList<ProjcetDTO>();
		sql = "select * from project where cat = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, cat);
			rs = ptmt.executeQuery();
			while (rs.next()) {
				ProjcetDTO dto = new ProjcetDTO();
				dto.setCompany(rs.getString("company"));
				dto.setTitle(rs.getString("title"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContent(rs.getString("content"));
				dto.setTargetamount(rs.getInt("targetamount"));
				dto.setWname(rs.getString("wname"));
				dto.setPrice(rs.getInt("price"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setCat(rs.getString("cat"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public ArrayList<ProjcetDTO> MyList(String nickname) {
		ArrayList<ProjcetDTO> res = new ArrayList<ProjcetDTO>();
		sql = "select * from project where nickname = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nickname);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				ProjcetDTO dto = new ProjcetDTO();
				dto = new ProjcetDTO();
				dto.setCompany(rs.getString("company"));
				dto.setTitle(rs.getString("title"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContent(rs.getString("content"));
				dto.setTargetamount(rs.getInt("targetamount"));
				dto.setPrice(rs.getInt("price"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setCat(rs.getString("cat"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public ArrayList<CommunityDTO> CList(String title) {
		ArrayList<CommunityDTO> res = new ArrayList<CommunityDTO>();
		sql = "select * from community where title = ?";

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			rs = ptmt.executeQuery();
			while (rs.next()) {
				CommunityDTO dto = new CommunityDTO();
				dto.setCid(rs.getInt("cid"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContentname(rs.getString("contentname"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public void cInsert(CommunityDTO dto) {

		try {
			sql = "select max(cid)+1 from community";

			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			dto.cid = rs.getInt(1);
			

			sql = "insert into community(title,nickname,contentname,content,reg_date)"
					+ "values(?,?,?,?,sysdate())";
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.title);
			ptmt.setString(2, dto.nickname);
			ptmt.setString(3, dto.contentname);
			ptmt.setString(4, dto.content);
			
			ptmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public CommunityDTO InDetail(int cid) {
		CommunityDTO dto = null;
		sql = "select * from community where cid = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, cid);

			rs = ptmt.executeQuery();
			if (rs.next()) {
				dto = new CommunityDTO();
				dto.setCid(rs.getInt("cid"));
				dto.setTitle(rs.getString("title"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContent(rs.getString("content"));
				dto.setContentname(rs.getString("contentname"));
				dto.setReg_date(rs.getTimestamp("reg_date"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}

	public void projectInsert(ProjcetDTO dto) {

		try {
			sql = "insert into project (company,title,content,nickname,wname,targetamount,price,personnel,reg_date,cnt,cat)values "
					+ "(?,?,?,?,?,?,?,0,sysdate(),-1,?)";

			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.company);
			ptmt.setString(2, dto.title);
			ptmt.setString(3, dto.content);
			ptmt.setString(4, dto.nickname);
			ptmt.setString(5, dto.wname);
			ptmt.setInt(6, dto.targetamount);
			ptmt.setInt(7, dto.price);
			ptmt.setString(8, dto.cat);
			ptmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void addFunding(int personnel,  String title) {
		sql = "update project set personnel = personnel+?  where title = ?";

		try {

			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, personnel);
			ptmt.setString(2, title);
			ptmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void funInsert(ProFundingDTO dto) {
		sql = "insert into profunding(title,nickname,price,personnel)" + "values(?,?,?,?)";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.title);
			ptmt.setString(2, dto.nickname);
			ptmt.setInt(3, dto.price);
			ptmt.setInt(4, dto.personnel);
			ptmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public ArrayList<ProFundingDTO> myFundingDetail(String nickname) {
		ArrayList<ProFundingDTO> res = new ArrayList<ProFundingDTO>();
		sql = "select * from profunding where nickname = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nickname);

			rs = ptmt.executeQuery();
			while (rs.next()) {
				ProFundingDTO dto = new ProFundingDTO();
				dto.setTitle(rs.getString("title"));
				dto.setPrice(rs.getInt("price"));
				dto.setPersonnel(rs.getInt("personnel"));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public void close() {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
			}
		if (ptmt != null)
			try {
				ptmt.close();
			} catch (SQLException e) {
			}
	}

}
