package argumentandreturntype;

public class withargumentandwithreturntype {
	public int m1(double c) {
		return(55);
	}
	public static boolean m2(char c) {
		return false;
	}
	public static void main(String[] args) {
		withargumentandwithreturntype on = new withargumentandwithreturntype();
		int d = on.m1(66);
		System.out.println(d);
		System.out.println(m2('c'));
	}
	

}
