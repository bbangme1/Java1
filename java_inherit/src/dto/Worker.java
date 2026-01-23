package dto;

// 직장인 정보
public class Worker {

	private String name; // 이름
	private String affiliation; // 소속
	private String age; // 나이
	private String phone; // 연락처
	private String work; // 업무
	private String desiredArea; // 희망지역
	private String desiredWork; // 희망업무

	public Worker(String name, String affiliation, String age, String phone, String work, String desiredArea,
			String desiredWork) {
		this.name = name;
		this.affiliation = affiliation;
		this.age = age;
		this.phone = phone;
		this.work = work;
		this.desiredArea = desiredArea;
		this.desiredWork = desiredWork;
	}

	public void workerdisplay() {
		System.out.println("[이름: " + name + ", 소속: " + affiliation + ", 나이: " + age + ", 연락처: " + phone + ", 현재업무: "
				+ work + ", 희망지역: " + desiredArea + ", 희망업무: " + desiredWork + "]");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getDesiredArea() {
		return desiredArea;
	}

	public void setDesiredArea(String desiredArea) {
		this.desiredArea = desiredArea;
	}

	public String getDesiredWork() {
		return desiredWork;
	}

	public void setDesiredWork(String desiredWork) {
		this.desiredWork = desiredWork;
	}

}
