package org.randomnum;

import java.util.Scanner;

public class Randomnum {
	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
	System.out.println("enter the value");
	long val = scan.nextLong();
	String loop=String.valueOf(val);
	int l=loop.length();
	int startindex=0;
	int sum=0;
//	String number="8459761203";
	String number="0123456789";
	for(int i=0;i<l;i++) {
		int calc=Math.abs(number.indexOf(loop.charAt(i))-startindex);
		startindex=number.indexOf(loop.charAt(i));
		sum=sum+calc;
	}
	System.out.println(sum);
}
}
