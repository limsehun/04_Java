package condition.ex;

/**
 * 조건문 예시 기능용 클래스
 */
public class ConditionEx {
	
	/**
	 * 1 ~ 10 사이 난수가 짝수인지 홀수인지 출력
	 */
	public void method1() {
		
		int ran = (int)(Math.random() * 10 + 1);
		
		if(ran % 2 != 1) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
		
	}
		

}
