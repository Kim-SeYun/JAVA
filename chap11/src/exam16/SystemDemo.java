package exam16;

public class SystemDemo {
	public static void main(String[] args) {
		// UTC 기준 1970년 1월 1일 0시0분0초0밀리초 ~ 현재까지를 밀리초로 나타냄
		long curTime = System.currentTimeMillis();
		System.out.println(curTime);
		curTime /= 1000;
		System.out.println(curTime + "초");
		curTime /= 60;
		System.out.println(curTime + "분");
		curTime /= 60;
		System.out.println(curTime + "시간");
		curTime /= 24;
		System.out.println(curTime + "일");
		curTime /= 365;
		System.out.println(curTime + "년");
		
	}

}
