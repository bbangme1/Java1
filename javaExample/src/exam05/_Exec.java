package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 이름, 주민번호, 나이, 성별

		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("주민번호 : ");
		String ssn = sc.nextLine();

		String imsi = ssn.substring(7, 8);
		String temp = ssn.substring(0, 2);

		int birthYear;
		int year = LocalDate.now().getYear(); // 현재 날짜 정보 가져오기

		String gender = "여자";
		if (imsi.equals("1") || imsi.equals("3")) {
			gender = "남자";
		}

		if (imsi.equals("1") || imsi.equals("2")) { // 1900년생
			birthYear = 1900 + Integer.parseInt(temp);
		} else { // 2000년생
			birthYear = 2000 + Integer.parseInt(temp);
		}

		int age = year - birthYear;

		System.out.printf("이름 : %s\n", name);
		System.out.printf("주민번호 : %s\n", ssn);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("성별 : %s\n", gender);
	}

}
