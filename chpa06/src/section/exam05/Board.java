package section.exam05;

public class Board {
	long id;
	String title;
	String contents;
	String writer;
	
	
	// 생정자 자동완성 단축기 : shift + alt + s
	// Generate Constructor Using Fields
	// Source - Generate Constructor Using Fields
	
	public Board(String title, String contents, String writer) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}
	
}
