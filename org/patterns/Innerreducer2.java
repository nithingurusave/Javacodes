package org.patterns;
import java.util.*;
public class Innerreducer2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		int mid=(num+1)/2;
//		int[][] arr=new int[num][num];
		for(int i=1;i<num+1;i++) {
			for(int j=1;j<num+1;j++) {
				if(i==j) {
					if(i<mid) {
						System.out.print(num-i+1);
					}
					else {
						System.out.print(i);
					}
				}
				else if(i+j==num+1) {
					   if(i<mid) {
						   System.out.print(i);
					   }
					   else {
						   System.out.print(j);
					   }
				   }
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
