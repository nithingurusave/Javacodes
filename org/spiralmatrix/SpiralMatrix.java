package org.spiralmatrix;
import java.util.*;
public class SpiralMatrix {
public static void main(String[] args) {
	//[1 ,2 ,3 ,4
	// 5 ,6 ,7 ,8
	// 9,10,11,12
	//13,14,15,16]
	int start=1;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the row value");
	int row = scan.nextInt();
	System.out.println("enter the column value");
	int column = scan.nextInt();
	int[][] arr=new int[row][column];
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			arr[i][j]=start;
			System.out.print(arr[i][j]+" ");
			start++;
		}
		System.out.println("");
	}
	System.out.println("**********************************************");
    //System.out.println(arr[0].length);
	//int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	//initialise values
	int top = 0,left=0;
	int bottom=arr.length-1;
	int right=arr[0].length-1;
   //System.out.println(bottom+" "+right);
	while(right!=0&&bottom!=0) {
	for(int i=left;i<=right;i++) {
		System.out.print(arr[top][i]+" ");
	}
	top++;
	for(int i=top;i<=bottom;i++) {
		System.out.print(arr[i][right]+" ");
	}
	right--;
	for(int i=right;i>=left;i--) {
		System.out.print(arr[bottom][i]+" ");
	}
	bottom--;
	for(int i=bottom;i>=top;i--) {
		System.out.print(arr[i][left]+" ");
	}
	left++;
}
}
}
