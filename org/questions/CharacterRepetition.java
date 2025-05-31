package org.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterRepetition {
	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
Map<Character,Integer> map=new LinkedHashMap();
String input = scan.nextLine();
		for(int i=0;i<input.length();i++) {
				
					map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
				
			}
		System.out.println(map);
	}
}
