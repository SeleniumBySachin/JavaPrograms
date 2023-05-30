package Practice;

public class SunnyNo {
	public static void main(String[] args) {
		int num=48;
		int count=0;
		for(int i=0;i<num;i++) {
			if(num+1==i*i) {
				count++;
				break;
			}
		}
		System.out.println(count);
	}

}
