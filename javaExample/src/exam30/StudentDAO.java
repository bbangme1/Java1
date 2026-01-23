package exam30;

import java.util.Map;

public class StudentDAO {

	public int setInsert(Map<String, String> map) {
		System.out.println("-- setInsert() --");
//		System.out.println(name+ssn+phone+address);
		
//		System.out.println(strs[0]);
//		System.out.println(strs[1]);
//		System.out.println(strs[2]);
//		System.out.println(strs[3]);
		
		System.out.println(map.get("name"));
		System.out.println(map.get("ssn"));
		System.out.println(map.get("phone"));
		System.out.println(map.get("address"));
		
		return 0;
	}
}
