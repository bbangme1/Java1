package stduy20260112;

public class UserInformation {
//	사용자 정보 클래스

	private String name; // 이름
	private String id; // 아이디
	private String password; // 비밀번호
	private int PhoneNumber; // 전화번호

	@Override
	public String toString() {
		return "UserInformation [name=" + name + ", id=" + id + ", password=" + password + ", PhoneNumber="
				+ PhoneNumber + "]";
	}

	public UserInformation(String name, String id, String password, int phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		PhoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
