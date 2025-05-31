package org.questions;

import java.util.Scanner;

public class StringRevSplCharacters {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the String");//example "#A&B*" 
String string=scan.nextLine();
char[] answer=string.toCharArray();
int front=0;int back=string.length()-1;
	while(front<back) {
		if(!Character.isAlphabetic(string.charAt(front))) {
			front++;
			continue;
		}
		if(!Character.isAlphabetic(string.charAt(back))) {
			back--;
			continue;
		}
		char temp=string.charAt(front);
		answer[front++]=answer[back];
		answer[back--]=temp;
	}
	System.out.println(answer);
}
}
