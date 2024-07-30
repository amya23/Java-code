
public class publicschool {
	int math;
	int chemistry;
	int physics;
	
	public void amit() {
		
	 math = 95;
	 chemistry = 93;
	 physics = 96;
	 
	 System.out.println("marks of amit =");
	 System.out.println("math"+math);
	 System.out.println("chemistry"+chemistry);
	 System.out.println("physics"+physics);
	 System.out.println(" ");
	}
	
	public void amita( ) {
		math = 55;
		chemistry =45;
		physics =35;
		System.out.println("marks of amita =");
		System.out.println("math"+math);
		System.out.println("chemistry"+chemistry);
		System.out.println("physics"+physics);
		System.out.println(" ");
	}
		
		public static void main (String[] args) {
			publicschool obj = new publicschool();
			obj.amit();
			obj.amita();
		}
	}


