package org.arrayTasks;

import java.util.Arrays;

public class Duplicates {
	public static void main(String[] args) {

		int[] arr= {1,2,3,2,4,5,6,4};
		int[] ans=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			boolean status=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==arr[j]) {
					status=true;
					break;
				}
			}
			if(!status) {
				ans[k]=arr[i];
				k++;
			}
	
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
