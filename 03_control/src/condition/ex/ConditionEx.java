package condition.ex;

import java.util.Scanner;

/**
 * 조건문 예시 기능용 클래스
 */
public class ConditionEx {
	
	// 필드(field) == 멤버 변수 == 인스턴스 변수 (전역 변수 비슷)
	Scanner sc = new Scanner(System.in);
	
	
	
	/**
	 * 1 ~ 10 사이 난수가 짝수인지 홀수인지 출력
	 */
	public void method1() {
		
		int ran = (int)(Math.random() * 10 + 1);
		
		if(ran % 2 != 1) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 * 20세 이상 : 성인 
	 * 
	 * 구분하여 출력하기
	 */
	public void method2() {
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt(); // 필드 sc 이용
		
		String result;
		
		if(age <= 13) {
			result = "어린이";
		
		} else if(age >= 14 && age <= 19) {
			result = "청소년";
			
		} else {
			result = "성인";
		}
		
		
	System.out.println(result);
	}
		
	/**
	 * 나이를 입력 받아
	 * 13세 이하 : 어린이
	 * 14세 이상 19세 이하 : 청소년
	 *  - 14~16 : 청소년(중)
	 *  - 17~19 : 청소년(고)
	 * 20세 이상 : 성인 
	 * 0 이하 또는 100 초과 : 잘못 입력하셨습니다
	 * 
	 * 구분하여 출력하기
	 */
	public void method3() {
		
			
		System.out.print("나이 입력 : ");
		int age = sc.nextInt(); // 필드 sc 이용
			
		String result;
		
/*		if(age<=0 || age>100) result="잘못입력하셨습니다.";
		else if (age<=13) {result="어린이";}
		else if(age >= 20) {result = "성인";}
		else if(age <= 16) {result = "청소년(중)";}
		else {result ="청소년(고)";}  내답*/
		
		if(age <= 0 || age > 100)  	result = "잘못 입력하셨습니다";
		else if(age <= 13)			result = "어린이";
		else if(age <= 19)  		result = "청소년" + ((age<=16) ? "(중)" : "(고)");
		else result = "성인";
		
		
		System.out.println(result);
	}
		

}
