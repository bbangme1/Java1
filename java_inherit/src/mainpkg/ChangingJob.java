package mainpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Company;
import dto.Worker;

public class ChangingJob {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Worker> worker = new ArrayList<>();
		Worker worker1 = new Worker("홍길동", "카카오", "30", "010-1111", "개발", "대전", "개발");
		worker.add(worker1);

		Worker worker2 = new Worker("이순신", "네이버", "25", "010-2222", "DB", "서울", "DB");
		worker.add(worker2);

		Worker worker3 = new Worker("유관순", "구글", "35", "010-3333", "디자인", "부산", "디자인");
		worker.add(worker3);

		List<Company> company = new ArrayList<>();
		Company company1 = new Company("카카오", "서울", "DB");
		company.add(company1);

		Company company2 = new Company("네이버", "부산", "디자인");
		company.add(company2);

		Company company3 = new Company("구글", "대전", "개발");
		company.add(company3);

		while (true) {
			System.out.println("선택(1:매칭, 2:회사조회, 3:정보수정, 4:종료");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("== 매칭 ==");
				System.out.println("이름 입력 : ");
				String name = sc.nextLine();
				for (Worker wor : worker) {
					if (wor.getName().equals(name)) {
						System.out.println(name + " 의 희망업무 : " + wor.getDesiredWork());
						for (Company com : company) {
							if (com.getRecruitmentWork().equals(wor.getDesiredWork()))
								System.out.println("매칭 구직글 : " + com.getCorporateName());
						}
					}
				}
				break;
			case "2":
				System.out.println("== 회사조회 ==");
				System.out.println("회사명 입력 : ");
				String corporateName = sc.nextLine();
				for (Company com : company) {
					if (com.getCorporateName().equals(corporateName)) {
						System.out.println("지역 : " + com.getArea() + " 채용업무 : " + com.getRecruitmentWork());
					}
				}

				break;
			case "3":
				System.out.println("== 정보수정 ==");
				System.out.println("수정할 이름 입력 : ");
				name = sc.nextLine();
				for (Worker wor : worker) {
					if (wor.getName().equals(name)) {
						System.out.print("수정할 소속 : ");
						wor.setAffiliation(sc.nextLine());
						System.out.print("수정할 나이 : ");
						wor.setAge(sc.nextLine());
						System.out.print("수정할 연락처 : ");
						wor.setPhone(sc.nextLine());
						System.out.print("수정할 업무 : ");
						wor.setWork(sc.nextLine());
						System.out.print("수정할 희망지역 : ");
						wor.setDesiredArea(sc.nextLine());
						System.out.print("수정할 희망업무 : ");
						wor.setDesiredWork(sc.nextLine());
						System.out.println("정보 수정이 완료되었습니다.");
						wor.workerdisplay();
					}
				}
				break;
			case "4":
				System.out.println("== 종료 ==");
				return;
			default:
				System.out.println("다시 입력해 주세요.");
			}
		}

	}

}
