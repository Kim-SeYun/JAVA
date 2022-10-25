package exam08;

public class DummyTest {
	
	public static int add(int a, int b) {
		a = 10;
		b = 12;
		return a+b; 
	}
	
	public static void main(String[] args) {
		int add = add(1,5);
		System.out.println(add);
		System.out.println(add(100,102));
	}

}