package arrays;

public class duplicatearrays {
	public static void main(String[] args) {
		int[] a = {1,2,34,1,22,34,45};
		for(int i = 0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j])
				System.out.println(a[j]);
			}
		}
	}

}
