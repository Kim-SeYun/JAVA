package exam16;

public class SystemDemo2 {
	public static void main(String[] args) throws InterruptedException {
		// 1부터 2000000까지의 합을 구하는데 걸리는 시간
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 2000; i++) {
			Thread.sleep(1);
			sum += i; 
			
		}
		long end = System.currentTimeMillis();
		long during = end - start;
		System.out.println("소요시간" + during + "밀리세컨드");
	}

}
