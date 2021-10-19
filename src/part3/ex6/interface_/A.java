package part3.ex6.interface_;

public class A {
	private X x;	
	
	public void setX(X x) {
		this.x = x;
	}

	public A() {
		// b = new B();
	}

	public void print() {
		int total = x.total();
		
		System.out.printf("total is %d\n", total);
		
	}
	
}
