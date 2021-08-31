package otherDay3;

class Father{
	
	int i = 1;
	
	void drive() {
		System.out.println("I have WRV");
	}
}

class Son1 extends Father{
	
	int j = 2;
	
	void drive() {
		System.out.println("I have Mclaren!");
	}
}

class Son2 extends Father{
	
	int k = 3;
	
	void drive() {
		System.out.println("I have Range Rover!");
	}
}

class Son3 extends Father{
	
	int l = 4;
	
	void drive() {
		System.out.println("I have Lamborghini!");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Father f = new Father();
		System.out.println(f.i);
		f.show();

		Son1 s1 = new Son1();
		System.out.println(s1.j);
		s1.show();
		
		Father s2 = new Son2();
		System.out.println(s2.i);
		s2.show();*/
		
		Father s1 = new Son1();
		display(new Son1());
		display(new Son2());
		display(new Son3());
		display(new Father());

		
	}
	static void display(Father f) {
		f.drive();
	}
}
