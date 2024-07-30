package practiceprogram;

public class zpschoolakhandur {
	public zpschoolakhandur(String name, int math, int physics, int chemistry)  {
		System.out.println("avdhut" + name);
		System.out.println("math" + math);
		System.out.println("physics" + physics );
		System.out.println("chemistry" + chemistry);
		int total = math+physics+chemistry;
		System.out.println("total" + total);
		System.out.println();
		
	}
	public static void main(String[] args) {
		new zpschoolakhandur("avdhut", 54,67,78);
		new zpschoolakhandur    ("amit",67,89,90);
		new zpschoolakhandur("vivek", 56,56,67);
		
	}

}
