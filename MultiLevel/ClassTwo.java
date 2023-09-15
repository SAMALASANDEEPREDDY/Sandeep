package MultiLevel;

public class ClassTwo extends ClassOne{

	public static void main(String[] args) {
		ClassTwo ct =new ClassTwo();
		ct.Flight();
		ct.ship();
		ct.bus();ct.Truck();

	}
	public void Flight() {
		System.out.println("flight code excecuted in two");
	}
	public void ship() {
		System.out.println("ship code excecuted in two");
	}

}
