package list.view;

import java.util.List;
import java.util.Scanner;

import list.dto.BookDTO;
import list.service.BookService;

// view : 사용자에게 보여지는 부분(출력, 입력)
public class BookView {
	
	private Scanner sc = new Scanner(System.in);
	private BookService service = new BookService();
	
	/**
	 * 사용자에게 보여질 메인 화면
	 */
	public void mainMenu() {
		int input = 0;
		
		do {
			System.out.println("\n***** 도서 관리 프로그램 *****\n");
			
			System.out.println("1. 전체 조회");
			System.out.println("2. index로 조회");
			System.out.println("3. 책 이름으로 조회");
			System.out.println("4. 글쓴이 이름으로 조회");
			System.out.println("5. 가격으로 조회");
			
			System.out.println("6. 책 추가하기");
			System.out.println("7. 책 제거하기");
			System.out.println("8. 책 가격 수정하기");
			
			System.out.println("0. 종료");
			
			System.out.println(); //줄 바꿈

			System.out.println("메뉴 선택 >> ");
			input=sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 엔터 제거
			
			System.out.println(); // 줄 바꿈
			
			switch(input) {
			case 1: selectAll(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 0: System.out.println("***** 프로그램 종료 *****"); break;
			default: System.out.println("=-=-= 잘못 입력 =-=-=");
			}
			
		} while(input != 0);
		
	} // mainMenu () method end
	
	/**
	 * 전체 조회
	 * - BookService에 있는 bookList를 얻어와
	 *   존재하는 모든 요소의 정보를 출력
	 */

	private void selectAll() {
		System.out.println("\n@@@@@ 전체 조회 @@@@@\n");
		
		List<BookDTO> bookList = service.selectAll();
		
		
		for(int i = 0 ; i < bookList.size(); i++) {
			// print() 관련 구문에서 참조 변수명을 작성하면
			// 자동으로 toString()이 호출된다!
			
			System.out.println(i + ") " + bookList.get(i));
		}
		
	}
	
	
	
	
}
