package exam13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list);
		
		list.add("홍길동");
		System.out.println(list);
		list.add("이성순");
		System.out.println(list);
		list.add("장천용");
		System.out.println(list);
	
		list.addFirst("111");
		System.out.println(list);
		list.addLast("999");
		System.out.println(list);
		
		// 중간 삽입 (매우 빠름)
		list.add(1, "222");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
	}

}
