package dto;

// 회사 정보
public class Company {

	private String corporateName; // 회사명
	private String area; // 지역
	private String recruitmentWork; // 채용업무

	public Company(String corporateName, String area, String recruitmentWork) {
		super();
		this.corporateName = corporateName;
		this.area = area;
		this.recruitmentWork = recruitmentWork;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRecruitmentWork() {
		return recruitmentWork;
	}

	public void setRecruitmentWork(String recruitmentWork) {
		this.recruitmentWork = recruitmentWork;
	}

}
