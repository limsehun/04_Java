package list.service;

import java.util.ArrayList;
import java.util.List;

/* Collection Framework : Java에서 제공하는 자료구조를 모아둔 것
 * (Java.util 패키지에 존재)
 * 
 * [특징]
 * 1) 크기 제한 X
 * 2) 추가, 수정, 삭제, 검색, 정렬 등 다양한 기능이 제공됨
 * 3) 객체만 저장 가능!!
 *    (정확히는 객체 참조 주소만 저장 가능)
 * 
 * [List]
 *  자료(Data)를 순차적으로 나열한 자료구조(배열 비슷)
 *  
 * - index가 존재함
 *  -> 각 Data를 index(순서)로 구분할 수 있어
 *     중복된 Data를 저장할 수 있다!!!
 */

public class ListService {

	public void test1() {
		
		//ArrayList 객체 생성
		// -> List인터페이스를 상속받은 자식 클래스로
		//	  가장 많이 사용되는 List
		
		// List : 부모 인터페이스
		//       -> 객체 생성 불가 / 부모 참조 변수 가능
		
//		List list = new ArrayList(); // 10칸 짜리 생성
		
		List list = new ArrayList(3); // 3칸 짜리 생성
		
		// E(Element) : 요소를 뜻하는 상징적인 글자
		//				(특정 자료형 X, Object 타입)
		
		// boolean add(E e)
		// - List에 주어진 객체(e)를 맨 끝에 추가
		list.add("아무거나");
		list.add(new Object());
		list.add(new int[4]); // 3번째
		
		// 4번째 -> 크기 초과 오류 발생 테스트
		// 		--> List 크기가 자동을로 증가
		
		list.add(123); // int기본자료형은 추가 불가
					   // -> Integer Wrapper class로
					   // 변환되어 저장됨
		
		System.out.println(list.toString());
		
	}
	
}
