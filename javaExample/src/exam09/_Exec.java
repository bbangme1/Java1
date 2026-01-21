package exam09;

import java.util.HashMap;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
//		HashMap (맵) - key, value
		Map<String, String> map = new HashMap<>();
		
		System.out.println("map : "+map); // {}출력
		map.put("name", "홍길동"); // 추가
		System.out.println("map : "+map); // {name=홍길동}출력
		map.put("kor",90+""); // 추가
		System.out.println("map : "+map); // {name=홍길동, kor=90}출력
		map.put("eng",80+""); // 추가
		System.out.println("map : "+map); // {name=홍길동, kor=90, eng=80}출력
		map.put("name","이성순"); // 수정
		System.out.println("map : "+map); // {name=이성순, kor=90, eng=80}출력
		
		System.out.println("---------------------------------");
		
		System.out.println(map.keySet());
		
		for (String key : map.keySet()) {
			System.out.println(key + " : "+map.get(key));
		}
		
//		map.remove("kor"); // 삭제
//		System.out.println("map : "+map); // {name=장천용, eng=80}출력
				
//		System.out.println(map.get("name")); // 추출
//		System.out.println(map.get("kor")); // 추출
//		
//		Map<Integer, Object> map2 = new HashMap<>();
//		map2.put(1, "홍길동"); // 추가
//		System.out.println("map : "+map2); // {1=홍길동}출력
		
		
		
		
		
	}

}
