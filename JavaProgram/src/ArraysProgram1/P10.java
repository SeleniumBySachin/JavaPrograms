package ArraysProgram1;

public class P10 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
