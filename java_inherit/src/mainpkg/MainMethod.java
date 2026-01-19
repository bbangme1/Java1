package mainpkg;

import dto.Cafe;

public class MainMethod {

	public static void main(String[] args) {

		String[] menu = { "아메리카노", "라뗴", "녹차", "홍차", "치즈케이크", "티라미슈" };

		Cafe cafe = new Cafe("DW카페", menu);

		cafe.showMenu();
		System.out.println("===========   \n");

		cafe.order("녹차");
		System.out.println("===========   \n");
		cafe.order("치즈케이크");
		System.out.println("===========   \n");
		cafe.order("사이다");
		System.out.println("===========   \n");

	}

}
