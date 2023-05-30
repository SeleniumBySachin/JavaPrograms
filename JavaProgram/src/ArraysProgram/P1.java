package ArraysProgram;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		int[][]a= {{1,20,3},{4,5,6},{7,8,9}};
		int big=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>big) {
					big=a[i][j];
				}
			}
		}
		System.out.println(big+" is a largest element in array");
	}

}
