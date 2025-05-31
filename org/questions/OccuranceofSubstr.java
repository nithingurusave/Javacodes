package org.questions;

import java.util.Scanner;

public class OccuranceofSubstr {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String string=scan.nextLine();
	System.out.println("enter a substring");
	String substring=scan.nextLine();
	int L=0;int count=0;
	while(L<=1) {
		System.out.println(string);
		for(int i=0;i<=string.length()-substring.length();i++) {
			if(string.substring(i,i+substring.length()).equals(substring)) {
				count+=1;
			}
		}
		if(L==0) {
			string=revsedString(string);
		}
		L++;
	}
	System.out.println(count);
}

private static String revsedString(String string) {
	String revstring="";
	for(int i=string.length()-1;i>=0;i--) {
		revstring+=string.charAt(i);
	}
	return revstring;
}
}
