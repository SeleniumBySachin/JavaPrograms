package ArraysProgram;

import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		int[][]res=toRead();
		display(res);
		
	}
	public static int[][] toRead(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the row and col");
		int row=s.nextInt();
		int col=s.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter "+row*col+" element");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	public static void display(int[][]a) {
		System.out.println("entered matrix element are :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
