package part3.ex6.interface_;

public class A {
	private B b;
	
	public A() {
		b = new B();
	}

	public void print() {
		int total = b.total();
		
		System.out.printf("total is %d\n", total);
		
	}
	
	
}
