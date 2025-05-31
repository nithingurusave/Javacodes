package org.arrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraverseAdv {
	static int arr[]= {1,2,3,4,5,6,7};
	static int ans[]=new int[arr.length];
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
	int travcount=scan.nextInt();
    for(int i=0;i<travcount;i++) {
    	rotate(travcount,ans,arr);
    }
    System.out.println(Arrays.toString(ans));
}
	public static void rotate(int travcount,int[] ans,int[] arr) {
		int input=1;
		int size=arr.length;
		for(int i=0;i<input;i++) {
			ans[size-input+i]=arr[i];
		}
		for(int j=0;j<size-input;j++) {
			ans[j]=arr[input+j];
		}
		for(int k=0;k<size;k++) {
			arr[k]=ans[k];
		}
	}
}
