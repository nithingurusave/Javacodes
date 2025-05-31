package org.questions;

public class Ques1 {
	public static void main(String[] args) {
		
String letter="";
String number="";	
StringBuilder result=new StringBuilder();
String input="a6b5c4d3e2f1gh5i3k2l1";
int i=0;
while(i<input.length()) {
	if(Character.isLetter(input.charAt(i))) {
		letter=String.valueOf((input.charAt(i)));
		number="1";
		i=i+1;
	}
	else {
		if(i<input.length()-1) {
		if(Character.isDigit((input.charAt(i)))==Character.isDigit((input.charAt(i+1)))) {
			number=String.valueOf(input.charAt(i))+String.valueOf(input.charAt(i+1));
			int number1=Integer.parseInt(number)-1;
			number=String.valueOf(number1);
			i=i+2;
		}}
		if(Character.isDigit(input.charAt(i))) {
		number=String.valueOf(input.charAt(i));
		int number1=Integer.parseInt(number)-1;
		number=String.valueOf(number1);
		i=i+1;
		}

	}
	for(int j=0;j<Integer.parseInt(number);j++)	{
		result=result.append(letter);
		}

}
System.out.println(result);
}
}