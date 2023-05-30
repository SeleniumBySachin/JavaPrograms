package ArraysProgram1;

public class P7 {
	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int[]b= {50,60,70,80,90,100};
	    int[]c=new int[a.length+b.length];
	    int i=0;
	    int j=0;
	    while(i<a.length&&i<b.length) {
	    	c[j]=a[i];
	    	j++;
	    	c[j]=b[i];
	    	j++;
	    	i++;
	    }
	    while(i<a.length) {
	    	c[j]=a[i];
	    	j++;
	    	i++;
	    }
	    while(i<b.length) {
	    	c[j]=b[i];
	    	j++;
	    	i++;
	    }
	    for(int k=0;k<c.length;k++) {
	    	System.out.println(c[k]);
	    }
	}

}
