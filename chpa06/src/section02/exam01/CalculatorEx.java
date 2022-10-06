package section02.exam01;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("µ¡¼À °è»ê°á°ú : " + calculator.plus(10, 15));
		
		calculator.powerOn();
//		calculator.powerState = true;
		System.out.println("µ¡¼À °è»ê°á°ú : " + calculator.plus(10, 15));
		calculator.powerOff();
		
		System.out.println("³ª´°¼À °è»ê°á°ú : " + calculator.divide(20, 6));
		
	}

}
