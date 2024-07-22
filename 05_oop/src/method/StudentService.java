package method;

import java.util.Scanner;

//기능 제공용 클래스
public class StudentService {

	// 필드
	private Scanner sc = new Scanner(System.in); // Scanner 객체  생성
	
	/*
	 * 메인 메뉴 화면
	 */
	public void mainMenu() {
		
		int input = 0; // 입력 받은 메뉴 번호를 저장 할 변수
		
		
		// 생성된 학생 객체 주소를 저장할 참조 변수
		// (null : 참조하는 객체가 없다, 주소 저장 X)
		Student std = null;
		
		// do ~ while : 최소 1회 이상 반복
		do {
			
			System.out.println("\n==== 학생 1명 관리 프로그램 ====");
			
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생정보 확인");
			System.out.println("3. 학생 이름 수정");
			System.out.println("4. Java 공부하기");
			System.out.println("5. HTML 공부하기");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴번호 입력 : ");
			input=sc.nextInt();
			
			sc.nextLine(); // 입력 버퍼에 남아있는 엔터 제거 
			
			System.out.println();
			
			switch(input) {
			case 1: 
				std=registStudent();
				
				System.out.println(std.getName()+"학생 등록됨");
				break;
				
			case 2: 
				System.out.println("[핚생 정보 확인]");
				
				//static은 클래스명을 붙여서 호출
				System.out.println("학교 : "+ Student.schoolName);
				
				System.out.println(std.toString());
				
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			
			case 0: System.out.println("===프로그램을 종료합니다.==="); break;
			
			default: System.out.println("===알맞은 메뉴 번호를 입력해주세요===");
			}
			
		}while(input !=0); //메뉴 0 선택시 반복 종료	
	}
	
	/*
	 * 학생등록 메서드
	 * 생성된 Student 객체의 주소 반환
	 */
	private Student registStudent() {
		
		System.out.println("[학생 등록]");
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학번 : ");
		String studentNumber = sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		
		Student student = new Student(name, studentNumber, gender);
		
		// student 변수에는 
		// 생성된 Student 객체를 참조하는 주소 값 담겨있다!!!
		// -> 주소 값을 반환 
		// (== 주소 값이 복사되어 호출한 곳으로 돌아감!!!) 
		return student;
	}
	
	
}
