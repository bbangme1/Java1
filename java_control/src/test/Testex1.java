package test;

class Member {

	String name;
	int age;

	public void introduce() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

class Student extends Member {

	String studentId;

	public void study() {
		System.out.println(name + "이(가) 공부를 합니다.");
	}

	@Override
	public void introduce() {
		System.out.println("학생 이름: " + name + ", 나이: " + age + " 학번 : " + studentId);		
	}
}

