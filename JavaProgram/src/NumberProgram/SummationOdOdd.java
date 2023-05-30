package NumberProgram;

public class SummationOdOdd {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while(num<=10) {
			if(num%2==1) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
	}

}
