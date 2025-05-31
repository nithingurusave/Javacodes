package org.arrayTasks;

public class Practice {
public static void main(String[] args) {

	String inp="NithNithinithiNithinith";String ans="";String finalans="";
	for(int i=0;i<inp.length();i++) {
		for(int j=i+1;j<inp.length();j++) {
			int x=i;int y=j;
			ans="";
			while(y<inp.length()&&x<inp.length()&&inp.charAt(x)==inp.charAt(y)) {
				ans+=inp.charAt(x);
				x++;y++;
			}
			if(finalans.length()<ans.length()) {
				finalans=ans;
				}
		}
	}
	System.out.println(finalans);
	
}
}
