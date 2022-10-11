package section02.exam07;

public class Card {
	int cardNumber; // 카드숫자(인스턴스)
	static int cardwidth; // 가로길이(정적)
	static int cardHeight; // 세로길이(정적)
	
	public Card() {
		// 정적멤버 비정적멤버 모두 사용 가능
		System.out.println(cardwidth); // 정적멤버 사용
		this.cardNumber = 8; //비정적 멤버 사용
	}
	
	static {
		// 정적멤버 사용가능
		cardwidth = 90;
		cardHeight = 95;
		// 비정적멤버를 사용할 수 없다.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	// static 메소드
	static void infoCardSize() {
		// 정적 멤버 사용 가능
		System.out.println(cardwidth);
		System.out.println(cardHeight);
		getMessage();
		// 비정적멤버를 사용할 수 없다.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// 인스턴스 메소드
	int getCardNumber() {
		// 정적멤버, 비정적 멤버 모두 사용가능
		getMessage(); // 정적 메소드
		cardNumber = 100; // 인스턴스 필드
		cardwidth = 80; // 정적 필드
		cardHeight = 40; // 정적 필드
		return this.cardNumber;
	}
	
	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}

}



// 정적멤버
// - 정적필드
// -정적메소드
// - 객체생성 유무 관계없음(언제나 사용가능)
//
// 비정적멤버(인스턴스 멤버)
// -생성자
// - 인스턴스 필드
// - 인스턴스 메소드
// - 객체생성 후에 사용가능
//
// 정적 블록(객체생성 보장x)
// - static 블록
// - static 메소드
//
//
// 비정적 블록(객체생성 보장o)
// -생성자
// -인스턴스 메소드


