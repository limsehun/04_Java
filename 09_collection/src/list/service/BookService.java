package list.service;

import java.util.ArrayList;
import java.util.List;

import list.dto.BookDTO;

// Service : 기능(비즈니스 로직) 제공용 클래스
public class BookService {

	// BookDTO 객체 참조 변수만을 저장하는
	// ArrayList 객체 생성
	// -> <BookDTO> == 제네릭(타입 제한)
	private List<BookDTO> bookList = new ArrayList<BookDTO>();

	
	// 기본 생성자
	public BookService() {
		
		bookList.add(new BookDTO("자바 프로그래밍 입문", "박은종", 25000));
		bookList.add(new BookDTO("선재 업고 튀어 대본집 세트", "이시은", 45000));
		bookList.add(new BookDTO("THE MONEY BOOK", "토스", 19800));
		
	}
	
	
	/**
	 * bookList를 반환하는 서비스 메서드
	 * @return bookList
	 */
	public List<BookDTO> selectAll() {
		return bookList;
	}
	
	
}
