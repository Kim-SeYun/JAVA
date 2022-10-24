package exam01;

public abstract class Dummy  implements RemoteControl{
	
	public abstract void dummyMethod();
	
	@Override
	public void turnOff() {
		System.out.println("TV ²û");
	}

}
