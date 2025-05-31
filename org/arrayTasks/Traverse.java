package org.arrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Traverse {
	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	int ans[]=new int[arr.length];
	int size=arr.length;
	Scanner scan=new Scanner(System.in);
	int input=scan.nextInt();
	
	//fill the arr elements at last as per the count
	for(int i=0;i<input;i++) {
		ans[size-input+i]=arr[i];
	}
	//fill the arr remaining array elements in front
	for(int j=0;j<size-input;j++) {
		ans[j]=arr[input+j];
	}
	System.out.println(Arrays.toString(ans));
}
}
