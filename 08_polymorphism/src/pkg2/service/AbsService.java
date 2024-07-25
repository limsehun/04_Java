package pkg2.service;

import pkg2.dto.Animal;
import pkg2.dto.Cat;
import pkg2.dto.Fish;

public class AbsService {

	/** 
	 * 추상 클래스 객체 생성 확인
	 */
	public void test1() {
		
		// Animal a = new Animal();
		// Cannot instantiate the type Animal
		// -> Animal은 객체화 할 수 없다
		//   왜? 추상 클래스라서 
		
		Cat  c = new Cat();
		Fish f = new Fish();
		
		// 오버라이딩한 추상 메서드 호출
		
		c.move();
		c.eat();
		c.sleep();
		
		f.move();
		f.eat();
		f.sleep();
		
	}
	
	/**
	 * 추상 클래스 활용법
	 * 
	 * 선행 지식 : 다형성 업캐스팅 + 동적 바인딩
	 */
	public void test2() {
		
		// 추상클래스는 객체 생성X
		// 대신 참조형 변수는 O
		
		Animal a1 = new Cat(2,10);
		Animal a2 = new Fish(2,2);
		// -> 에러 안남 확인
		
	}
	
	
}

