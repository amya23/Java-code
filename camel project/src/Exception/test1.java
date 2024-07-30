package Exception;

public class test1 {
	public static void main(String[] args) {
		String s="amit nanaji";
		String str[]=s.split("\\s");
		String reversestring=" ";
		for(String a:str) {
			String reverse=" ";
			for(int i=a.length()-1; i>=0; i--) {
				
				reverse=reverse+a.charAt(i);
			}
			reversestring=reversestring+reverse+" ";
		}
		System.out.println(reversestring);
		
		
		}
	}


