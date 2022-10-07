package section02.exam08;

import java.util.Calendar;

import section02.exam07.Card;

public class SingleTonExam {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1==obj2);
	}

}
