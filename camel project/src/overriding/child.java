package overriding;

public class child extends parent {
	public void m2() {
		System.out.println("m2 is child");
	}
	public static void main(String[] args) {
		child on = new child();
		on.m2();
	}

}
