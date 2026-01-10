package test;

import java.util.Iterator;

public class Testquiz1 {

	public static void main(String[] args) {
//		문제 1번
		int[] monthlySales = { 1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000 };

		int totle = 0, avg = 0, maxdal = 0, mindal = 0, avgdal = 0;
		int max = monthlySales[0];
		int min = monthlySales[0];

		for (int i = 0; i < monthlySales.length; i++) {
			totle += monthlySales[i];
			if (max < monthlySales[i])
				max = monthlySales[i];
			if (min > monthlySales[i])
				min = monthlySales[i];
		}
		avg = totle / monthlySales.length;
		for (int j = 0; j < monthlySales.length; j++) {
			if (max == monthlySales[j])
				maxdal = j + 1;
			if (min == monthlySales[j])
				mindal = j + 1;
			if (avg > monthlySales[j])
				avgdal++;
		}

		System.out.println("토탈 매출 : " + totle);
		System.out.println("평균 매출 : " + avg);
		System.out.println("최고 매출 : " + maxdal + "월 " + max + "만원");
		System.out.println("최저 매출 : " + mindal + "월 " + min + "만원");
		System.out.println("평균 매출 이상 월 : " + avgdal + " 개월");

//		문제 2번
		int[] attendance = { 1, 1, 2, 1, 3, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1 };

		int ida = 0; // 출석
		int perception = 0; // 지각
		int gyeolseog = 0; // 결석
		int totle1 = 0; // 출결 점수

		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i] == 1)
				ida++;
			totle1++;
			if (attendance[i] == 2)
				perception++;
			if (attendance[i] == 3)
				gyeolseog++;
			totle1--;
		}
		if (gyeolseog > 3 || totle1 <= 8)
			System.out.println("위험");

//		문제 3번
		int[] counseling = { 12, 8, 15, 15, 3, 9, 20 }; // 상담수
		int[] contract = { 2, 1, 3, 0, 0, 1, 4 }; // 계약수
		int[] claims = { 0, 1, 0, 2, 1, 0, 3 }; // 클레임수
		String[] week = { "월", "화", "수", "목", "금", "토", "일" }; // 요일

		int counselingtotal = 0; // 상담수 총합
		int contracttotal = 0; // 계약수 총합
		int claimstotal = 0; // 클레임수 총합

		int maxconversionrate = 0; // 최고 전환율
		int maxcounseling = 0; // 최고 상담수
		int maxcontract = 0; // 최고 계약수
		int day = 0;

		for (int i = 0; i < counseling.length; i++) {
			counselingtotal += counseling[i];
			contracttotal += contract[i];
			claimstotal += claims[i];

			if (maxcounseling < counseling[i]) {
				maxcounseling = counseling[i];
			}
			if (maxcontract < contract[i]) {
				maxcontract = contract[i];
			}
			maxconversionrate = (contract[i] * 100) / counseling[i];
			day = i;
		}

		System.out.println("주간 상담 총합 : " + counselingtotal);
		System.out.println("주간 계약 총합 : " + contracttotal);
		System.out.println("주간 클레임 총합 : " + claimstotal);
		System.out.println("최고 전환율 : " + week[day] + "(" + maxconversionrate + "%)");

	}
}
