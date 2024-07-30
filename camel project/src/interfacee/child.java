package interfacee;

public class child extends parent {
	static int a = 100;
	int b = 200;
	public void m2() {
		System.out.println("m2 is of child");
		
	}
	public void childmethod() {
		System.out.println(b);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		child on = new child();
		on.m1();
		//system.out.println(child.b);
		//system.out.println(a);
		on.childmethod();
		
	}

}
