package org.patterns;
import java.util.*;
public class Hallowrectangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row value");
		int row = scan.nextInt();
		System.out.println("enter column value");
		int column = scan.nextInt();
		scan.close();
		int[][] arr=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i==0||i==row-1||j==0||j==column-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
