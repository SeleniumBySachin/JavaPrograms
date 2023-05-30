package Practice;

public class PrimeNo {
	public static void main(String[] args) {
		int num=9;
		int a=2;
		int count=0;
		while(a<=num/2) {
			if(num%a==0) {
				count++;
				break;
			}
			a++;
		}
		if(count==0) {
			System.out.println("prime no");
		}else {
			System.out.println("not a prime no");
		}
	}

}
