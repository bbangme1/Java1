package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry")); // ArrayList<>로 감싸면 추가 가능
		List<Integer> intList = Arrays.asList(1, 2, 3); // asList는 추가 및 삭제 불가 수정만 가능

//		strList.add("aaa");
//		strList.remove(0);
//		strList.set(1,"한라봉");		
//		System.out.println(strList);

//		System.out.println("문자열 리스트 : ");
//		UnboundedExample.printAll(strList);
//
//		System.out.println("숫자 리스트 : ");
//		UnboundedExample.printAll(intList);

	}

}
