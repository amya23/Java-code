package argumentandreturntype;

public class withargumentandnoreturn {
	public void m1(int a) {
		System.out.println(a);
	}
	public static void m2(boolean c) {
		System.out.println(c);
	}
	public static void main(String[]args) {
		withargumentandnoreturn on = new withargumentandnoreturn();
		on.m1(200);
		m2(false);
	}
	

}
