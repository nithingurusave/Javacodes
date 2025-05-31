package org.arrayTasks;


import java.util.Arrays;

public class RepeatCount {
	public static void main(String[] args) {

		int[] arr= {1,2,3,2,4,5,6,4};
		int[] ans=new int[arr.length];
		int k=0;String support="";
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count>1 && !support.contains(String.valueOf(arr[i]))) {
				System.out.println(arr[i]+" repreted"+count+"times");
				support+=String.valueOf(arr[i]);
			}
		}
	}

}

