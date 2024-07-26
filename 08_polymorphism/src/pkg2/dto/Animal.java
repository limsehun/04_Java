package pkg2.dto;

/* 추상클래스
 * 1) abstract 메서드를 가지고 있는 클래스
 * 
 * 2) 객체로 만들면 안되는 클래스
 * 
 */

public abstract class Animal {
	
	// 공통적인 속성(필드)
	private int eyes; // 눈 개수 저장
	
	// 기본 생성자
	public Animal() { /* super(); */ }
	
	// 매개 변수 생성자
	public Animal(int eyes) {
		this.eyes = eyes;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public void setEyes(int eyes) {
		this.eyes=eyes;
	}
	
	@Override
	public String toString() {
		return eyes + ""; // int+String ==String
	}
	
	// 공통된 기능(메서드)
	
	// abstract : 추상적인

	/*추상 메서드
	 * - 공통된 기능의 이름을 갖지만
	 * 	 정의를 할 수없는 메서드
	 * 
	 * - 예약어 abstract 작성해야함
	 * 
	 * - 끝에 중괄호{}를 지우고 세미콜론; 작성
	 * 
	 * - 상속받은 자식 클래스에서 
	 * 	   해당 메소드를 정의하도록 강제함
	 * 	 --> 오버라이딩 강제함
	 */
	public abstract void move();
	
	public abstract void eat();
	
	public abstract void sleep();
	
	
	
	
}
