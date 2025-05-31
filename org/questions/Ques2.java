package org.questions;
import java.util.Scanner;
public class Ques2 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int count=1;
	String result ="";
	String input= scan.nextLine();
	int range=input.length();
	for(int i=0;i<range-1;i++) {
		if(input.charAt(i)==(input.charAt(i+1))) {
			count=count+1;
		}
		else {
			result=result+(String.valueOf(count)+""+input.charAt(i));
			count=1;
			
		}
	}
	result=result+(String.valueOf(count)+""+input.charAt(range-1));
	System.out.println("result"+"    "+result);
	}
}
