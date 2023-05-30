package ArraysProgram;

public class CountNoOfPrimeNo {
	public static void main(String[] args) {
		int[]a= {3,7,11,13,21,18,10};
		int res=count(a);
		System.out.println(res);
		
	}
	public static int count(int[]a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean res=isPrime(a[i]);
			if(res) {
				count++;
			}
		}
		return count;
	}
	public static boolean isPrime(int a) {
		int s=2;
		while(s<a/2) {
			if(a%s==0) {
				return false;
			}
			s++;
		}
		return true;
	}

}
