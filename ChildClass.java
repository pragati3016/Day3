package day3;

public class ChildClass extends AccessDemo {
	
	AccessDemo a = new AccessDemo();
	ChildClass c = new ChildClass();
	
	void test()
	{
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
	}
	
}