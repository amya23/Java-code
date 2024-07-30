package casting;

public class child extends parent {
	private static final parent childref = null;
	void m3() {
		System.out.println("m3 is of child");
		
	}
	 public static void main(String[] args) {
		// parent pref = new child();
		// child cref= (child) pref;
		 
		 parent ref1=(parent)childref;
		 ref1.m1();
		 ref1.m2();
		 ref1.m3();
		 
		 
	 }

}
