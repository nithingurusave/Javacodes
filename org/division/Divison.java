package org.division;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class Divison {
public static void main(String[] args) {
	int divisor=0;
	String divisorvalue="";
	int remainder=0;
	int subtract=0;
	int initial=0;
	
//	Scanner scan=new Scanner(System.in);
//	System.out.println("enter divisor");
	int nextInt =145614;
//	System.out.println("enter divider");
	int nextInt2 =14;
	int quotient=nextInt/nextInt2;
	String quotientlength=String.valueOf(quotient);
//	to find quotient siz
//	String val=Integer.toString(nextInt);
	for(int i=0;i<3;i++) {
	String finalquotient ="";
	StringBuilder finalquo=new StringBuilder(String.valueOf(finalquotient));
	String val=String.valueOf(nextInt);
	int[] array=new int[val.length()];
	//1
	for(int j=0;j<val.length();j++) {
		array[j]=val.charAt(j)-'0';
		
	}
	
		int index=array[0];
		int count=0;
		//2
		while(index<nextInt2) {
			index=Integer.parseInt(""+index+array[count+1]);
		}
	    divisor=index/nextInt2;
	    divisorvalue=divisor+"";
	    subtract=divisor*nextInt2;
	   //3
	    while(String.valueOf(subtract).length()!= val.length()) {
	    	subtract=subtract*10;
//	    	 System.out.println("     "+"| "+subtract);
	    }
	   
	    if(nextInt<subtract) {
	    	subtract=subtract/10;
	    }
	    if(nextInt==subtract) {
	    	divisorvalue=divisorvalue+"0";
	    }
	    Integer divstr=Integer.parseInt(divisorvalue);
	    if(divstr>nextInt) {
	    	divisorvalue=divisorvalue.substring(0,1);
	    }
	    remainder=nextInt-subtract;
	    int iterate=0;
//	    while(remainder>nextInt2) 

	    while(remainder>nextInt2){
	    	StringBuilder rem=new StringBuilder(String.valueOf(remainder));
//	    	System.out.println("rem"+rem);
	    	 val=String.valueOf(remainder);
//	    	 System.out.println("jhda jck dc"+val);
	    		for(int j=0;j<val.length();j++) {
	    			array[j]=val.charAt(j)-'0';
	    			
	    		}
	    		
	    			 index=array[0];
//	    			 System.out.println("index"+index);
	    			 count=0;
	    			while(index<nextInt2) {
	    				index=Integer.parseInt(""+index+array[count+1]);
	    			}
//	    			System.out.println("index val"+index);
//	    		    divisor=index/nextInt2;
	    		    divisorvalue=divisorvalue+""+index/nextInt2;
//	    		    System.out.println(divisorvalue.length()-1);
	    		     		  
//	    		    if(divisorvalue.charAt(divisorvalue.length()-1)&& divisorvalue.charAt(divisorvalue.length()-1)==0){
//	    		    	divisorvalue.concat('0');
//	    		    }
//	    		    System.out.println(divisorvalue);
	    		    if(initial>0) {
	    		    System.out.println("     "+"| "+subtract);
	    		  	System.out.println("      -----------------");
	    		  
	    		    }
	    		    subtract=(index/nextInt2)*nextInt2;
//	    		    System.out.println(subtract);
	    		    while(String.valueOf(subtract).length()!= val.length()) {
	    		    	subtract=subtract*10;
	    		    }
	    		    int arrlen1=array[array.length-1];
	    		    String sub=String.valueOf(subtract);
	    		    int arrlen=sub.length()-1;
	    		    int arrlen2=sub.charAt(arrlen)-48;
//	    		    System.out.println(arrlen1+"i"+arrlen2);
	    		    if(arrlen+1==array.length) {
	    		    if(arrlen1==0 && arrlen2==0) {
	    		    	 divisorvalue=divisorvalue.concat("0");
	    		    
	    		    }
	    		    }
	    		   
	    		   if(initial>0) {
	   		 		System.out.println("     "+"| "+remainder);
	   		 	    System.out.println("     "+"| "+subtract);
	   		      	System.out.println("      -----------------");
	   				//System.out.println();
	   				i++;
	    		   }

	    		   remainder=remainder-subtract;
	    		   if(initial>0) {
	    			 if(remainder<nextInt2) {
	    				   System.out.println("     "+"| "+remainder);
	    				   remainder=0;
	    			   }}
	    		   // System.out.println(i);
//	    		    val=String.valueOf(remainder);
	    		    finalquotient=divisorvalue;
	    }
	    //System.out.println(i);
	
	    if(initial==0) {
		System.out.println("       "+finalquotient);
		System.out.print("      -----------------");
		System.out.println();
		System.out.println("    "+nextInt2+"| "+nextInt);
		initial++;
	    }
	    
	    
//	    if(i<val.length()) {
//
//		System.out.println("     "+"| "+subtract);
//		System.out.println("      -----------------");
//		System.out.println("     "+"| "+remainder);
//		System.out.println();
//	    }
	}

	
	
}
}
