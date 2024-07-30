package methods;

public class nonstaticmethod {
	public void demo() {
		System.out.println("demo is a non static method");
	}
	public static void main (String[] args) {
		nonstaticmethod on = new nonstaticmethod();
		on.demo();
	}

}
