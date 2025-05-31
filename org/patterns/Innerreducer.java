package org.patterns;
import java.util.*;
public class Innerreducer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		int[][] arr = null;

		scan.close();
		int Originalsize=num*2-1;
		int size=Originalsize;
		int first=0;
		arr=new int[size][size];
		while(num>0) {
		
		for(int i=first;i<size;i++) {
			for(int j=first;j<size;j++) {
				if(i==first||i==size-1||j==first||j==size-1) {
					arr[i][j]=num;
				}
			}
		  }
		first++;
		 num--;
		 size--;
		}
		pass(arr,Originalsize);
	}

	private static void pass(int[][] arr, int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}
