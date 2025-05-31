package org.questions;
import java.util.Scanner;
public class FindLongestSubString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=scan.nextLine();
	int x=0;int y=0;int size=0;String answer="";
	for (int i=0;i<string.length();i++) {
		for(int j=i+1;j<string.length();j++) {
			x=i;y=j;
			String substring="";
			while(x<string.length()&&y<string.length()&&string.charAt(x)==string.charAt(y)) {
				substring+=string.charAt(x);
				x++;y++;
			}
			if(substring.length()>size) {
				size=substring.length();
			//	System.out.println(size);
				answer=substring;
			}
		}
	}
	System.out.println(answer);
}
}
