package differentclasses.java;

import method.java.Behaviour;

public class classB {
	public static void main(String[] args) {
		classA on = new classA();
		on.m1();
		System.out.println(on.a);
		
	 Behaviour on1 = new Behaviour();
	 on1.m1();
	}

}
