package NumberProgram;

public class PrimeNo1 {
public static void main(String[] args) {
	int num=11;
	int s=2;
	int count=0;
	while(s<=num/2) {
		if(num%s==0) {
			count++;
			break;
		}
		s++;
	}
	if(count==1) {
		System.out.println("not a prime");
	}else {
		System.out.println("prime");
	}
}
}
