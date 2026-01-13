package stduy20260113;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		
//		User[] users = new User[5];
//		
//		User클래스 객체생성
//		users[0] = new User("lee","1234","이순신","01011111111");	
//		
//		users[0].setName("이순신");
//		
//		System.out.println(users[0].getName());
//		System.out.println(users[1]);

		
		User[] users = {
				new User("lee","1234","이순신","01011111111"),
				new User("kim","4321","김춘추","01022222222"),
				new User("han","2134","한용운","01033333333"),
				new User("huh","3124","허준","01044444444"),
				new User("you","4213","유관순","01055555555")
		};
		
		UserService us = new UserService();
//		us.findId(users);
//		us.findPassword(users);
//		System.out.println(Arrays.toString(users));
		us.login(users);
		
		
	}

}
