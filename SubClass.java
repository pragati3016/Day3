package day3;

public class SubClass extends AccessDemo {
	
	AccessDemo a = new AccessDemo();
	ChildClass c = new ChildClass();
	SubClass s = new SubClass();
	
	void test()
	{
		System.out.println(a.j);

		System.out.println(c.j);
		
		System.out.println(s.j);
		System.out.println(s.k);
	}

}
