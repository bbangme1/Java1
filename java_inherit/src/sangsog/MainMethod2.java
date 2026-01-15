package sangsog;

import animals.Dog;
import animals.Cat;
import animals.Rabbit;
import animals.Bird;
import common.Animal;

public class MainMethod2 {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(" 공 짜 "," 말티푸 "), 
				new Cat(" 에 요 "), 
				new Rabbit(" 긴 귀 "),
				new Bird(" 참 새 ")};

		for (Animal a : animals) {
			a.sound();
			a.sleep();
			
			if(a instanceof Dog)
			((Dog) a).getBreed();
			
			System.out.println();
		}

//		((Dog) animals[0]).getBreed(); // 형(타입)변환
//		Dog dog = (Dog) animals[0];
//		Animal aa = dog;
	}

}

//	Bird 클래스를 만드시오
//	짺짹 소리 나게 하시오
