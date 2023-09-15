package MultiLevel;

public class ClassThree extends ClassTwo{

	public static void main(String[] args) {
		ClassThree ct=new ClassThree();
		ct.breaks();
		ct.engine();
		ct.Flight();
		ct.ship();
		ct.bus();
		ct.Truck();

	}
	
	public void breaks() {
		System.out.println("breaks  code excecuted in three");
	}
	public void engine() {
		System.out.println("engine  code excecuted in three");
	}


}
