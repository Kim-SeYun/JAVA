package exam03;

public abstract class Building implements Liftable, Repeareable, Generatable{
	
	public void buildComplete() {
		System.out.println("�Ǽ��Ϸ�"); 
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
