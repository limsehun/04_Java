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
			System.out.println("3. 책 이름으로 조회(포함)");
			System.out.println("4. 글쓴이 이름으로 조회(포함)");
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
			case 2: selectIndex(); break;
			case 3: selectTitle(); break;
			case 4: selectWriter(); break;
			case 5: selectPrice(); break;
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
	/*
	 * 입력받은 index번째 BokkDTO를 반환 받아와 출력
	 */
	private void selectIndex() {
		
		System.out.println("\n@@@@index로 조회@@@@\n");
		
		System.out.println("죄회할 책의 index번호 입력 : ");
		int index = sc.nextInt();
		
		// 전달한 index번째 요소가 존재하면 BookDTO rorcp wnth
		// 없다면 null 반환
		BookDTO book = service.selectIndex(index);
		
		if(book == null) {
			System.out.println("=-=-= 해당 인덱스에 책이 존재하지않습니다.");
			return;
		}
		
		System.out.println("제목 : " + book.getTitle());
		System.out.println("제목 : " + book.getWriter());
		System.out.println("제목 : " + book.getPrice()+"원");
		
		
		
	}
	
	/**
	 * 입력 받은 책 제목이 포함된 모든 책 출력하기
	 * 단, 없으면 "조회 결과가 없습니다" 출력
	 */
	private void selectTitle() {
		System.out.println("\n@@@@@ 책 이름으로 조회(포함) @@@@@\n");
		
		System.out.print("검색한 책 제목 입력 : ");
		String title = sc.nextLine();
		
		List<BookDTO> searchList = service.selectTitle(title);
		
		// 만약 검색 결과가 없을 경우
		//if(searchList.size() == 0) {
		if(searchList.isEmpty()) {
		System.out.println("=-=-= 조회 결과가 없습니다. =-=-=");
		return;
		}
		
		//검색 결과가 있는 경우
		for(BookDTO book : searchList) {
		System.out.println(book);
		}
	}
	
	
	/**
	 * 입력된 글쓴이 이름이 같은 책을 모두 조회하여 출력하기
	 *  단, 없으면 "조회 결과가 없습니다" 출력
	 */
	private void selectWriter() {
		System.out.println("\n@@@@@ 글쓴이 이름으로 조회(포함) @@@@@\n");
	
	}
	
	
	/**
	 * 검색할 가격의 범위(최소값, 최대값)을 입력 받아
	 * 가격 범위 내의 모든 책을 조회하여 출력
	 *  단, 없으면 "조회 결과가 없습니다" 출력
	 */
	private void selectPrice() {
		System.out.println("\n@@@@@ 가격으로 조회 @@@@@\n");
		
	}
	

	
	
	
}
