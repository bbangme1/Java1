package exam29;

// 회원 정보
public class MemberList {
	private String id; // 아이디
	private String passwold; // 비밀번호
	private String name; // 이름
	private String phoneNumber; // 핸드폰번호
	private String address; // 주소

	public MemberList(String id, String passwold, String name, String phoneNumber, String address) {
		this.id = id;
		this.passwold = passwold;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public void ListDisplay() {
		System.out.println("회원 목록 [아이디 : "+id+", 이름 : "+name+"]");			
	}
	
	public void display() { // 회원 상세 정보
		System.out.println("회원 상세 정보 [아이디 : " + id + ", 비밀번호  : " + passwold + ", 이름 : " + name + ", 핸드폰 번호 : " + phoneNumber
				+ ", 주소 : " + address + "]");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswold() {
		return passwold;
	}

	public void setPasswold(String passwold) {
		this.passwold = passwold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}