package org.arrayTasks;

import java.util.Scanner;

public class Xpattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j) {
					if(i+1<(size+1)/2) {
					arr[i][j]=size-i;
					}
					else {
						arr[i][j]=i+1;
					}
				}
				else if(i+j==size-1) {
					if(j+1>(size+1)/2) {
						arr[i][j]=i+1;
					}
					else {
						arr[i][j]=j+1;
					}
				}
			}
		}
		
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i][j]==0) {
					System.out.print(" ");
				}
				else {
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println("");
		}
	}

}
