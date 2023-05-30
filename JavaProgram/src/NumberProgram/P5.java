package NumberProgram;

public class P5 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while(num<=10) {
			if(num%2==0) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
	}

}
