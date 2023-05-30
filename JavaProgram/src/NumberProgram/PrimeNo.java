package NumberProgram;

public class PrimeNo {
	public static void main(String[] args) {
		String prime = isPrime(2, 7);
		System.out.println(prime);
		
	}
	public static String isPrime(int s,int num) {
		while(s<num/2) {
			if(num%s==0) {
				return "Not a prime";
			}
			s++;
		}
		return "Prime";
	}

}
