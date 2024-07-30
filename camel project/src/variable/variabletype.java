package variable;

public class variabletype {
	int a =15;
	public void m1() {
		int a = 10;
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		variabletype on = new variabletype();
		on.m1();
	}

}
