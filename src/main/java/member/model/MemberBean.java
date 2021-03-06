package member.model;

import javax.validation.constraints.NotBlank;

public class MemberBean {
	private int num;
	@NotBlank(message="필수입력 사항입니다.")
	private String id;
	@NotBlank(message="필수입력 사항입니다.")
	private String password;
	@NotBlank(message="필수입력 사항입니다.")
	private String name;
	
	private String regdate;

	@NotBlank(message="필수입력 사항입니다.")
	private String tel1;
	@NotBlank(message="필수입력 사항입니다.")
	private String tel2;
	@NotBlank(message="필수입력 사항입니다.")
	private String tel3;
	private String authority;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
