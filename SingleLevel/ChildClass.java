package SingleLevel;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.car();
		cc.jeep();
		cc.bike();
		cc.cycle();

	}
	public void car() {
		System.out.println("car code executed in child");
	}
	public void jeep() {
		System.out.println("jeep code is excecuted in child");
	}

}
