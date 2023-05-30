package NumberProgram;

public class SunnyNo {
	public static void main(String[] args) {
		int num=24;
		int count=0;
		int i=1;
		while(i<=num/2) {
			if(i*i==num+1) {
				count++;
				break;
			}
			i++;
		}
		if(count==1) {
			System.out.println("Sunny");
		}else {
			System.out.println("not a sunny");
		}
	}

}
