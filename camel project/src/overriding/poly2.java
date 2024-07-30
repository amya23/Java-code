package overriding;

public class poly2 extends poly1{
	public void m2() {
		System.out.println("m2 is child");
	}
	public static void main(String[] args) {
		poly2 on = new poly2();
		on.m2();
	}

}
