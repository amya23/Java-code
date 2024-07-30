package Exception;

public class test3 {
	private static test3 ref1;
	public void totalmarks(int marks) {
		if (marks<=40)
			throw new IllegalArgumentException("failed");
		else
			System.out.println("passed");
	}
	public static void main(String[] args) {
		test3 ref = new test3();
		try {
			ref.totalmarks(39);
		}
		catch(IllegalArgumentException ref1) {
			System.out.println(ref1.getMessage());
		}
		ref1.totalmarks(50);
	}
	
	}


