package exam03;

public abstract class Building implements Liftable, Repeareable, Generatable{
	
	public void buildComplete() {
		System.out.println("건설완료"); 
	}
}

class DummyA{}
class DummyB{}

interface Liftable{
	void lift();
}
interface Repeareable{
	void  repare();
}
interface Generatable{
	void generate();
}
