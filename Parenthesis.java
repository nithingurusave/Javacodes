 import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Parenthesis {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<String> li=new LinkedList<>();
		List<String> li2=new LinkedList<>();
		List<String> front=new LinkedList<>();
		List<Object> back=new LinkedList<>();
		String res ="";String temp="";int count=0;int w=0;
		StringBuilder sb=new StringBuilder();
		System.out.println("enter a number between 1 and 5");
		int input = scan.nextInt();
		while(w<=1){  // the loop runs twice w==0 to store front part and w==1 for reverse part
		String x="{"; String y="}";
		if(w==1) {
		 x="}"; y="{";  // values interchange when w==1
		}
		String[] arr= {x,y};
		if(input>0&&input<5) {		//loop works based on the input value
		   for( String a:arr) {
			   if(input>1&&input<5) {
				   for(String b:arr) {
					   if(input>2&&input<5) {
						   for(String c:arr) {
							   if(input>3&&input<5) {
								   for(String d:arr) {
									   if(input==4) {
										   res=a+b+c+d;
										   if(w==0) {
										   li.add(res); //adds the front part into li when while loop==0;
										   }
										   else {
											   li2.add(res);//adds the back part in li2 when while loop==1
										   }
										   }
								   }
							   }
							   if(input==3) {
								   res=a+b+c;
								   if(w==0) {
									   li.add(res);
									   }
									   else {
										   li2.add(res);
									   }
								   }
						   }
					   }
					   if(input==2) {
						   res=a+b;
						   if(w==0) {
							   li.add(res);
							   }
							   else {
								   li2.add(res);
							   }   
						   }
				   }
			   }
			   if(input==1) {
			   res=a;
			   if(w==0) {
				   li.add(res);
				   }
				   else {
					   li2.add(res);
				   }
			   }   
		   }
		   
		   
		   if(w==0)
		   System.out.println(li);//print the whole stored list(front part)
		   if(w==1)
		   System.out.println(li2);//print the whole stored list(back part)
		   
		   
		   if(w==0) {          //this condion for only front part (loop w==0)
		   for(String rev:li) { //from the list it send each value one by one to the variable rev.
			 count=0;			// setting the count as 0 initially
			 if(input%2!=0) {	//it will work for the odd input
			 if(rev.charAt(0)=='{') {    //if first value ex "{{{{" first char == { it will execute.
			 for(int i=0;i<rev.length();i++) {//if condition is true enters for loop and iterates through the length of it.
				 if(rev.charAt(i)=='{') { // for ex if "{{}{" if condition satisfies the count will be 1.
					 if(rev.charAt((input/2)-1)=='}'&& rev.charAt(input/2)=='}') {//this for removing the particular selected value
					 //will be more understanding with even number 
						 continue;//if condition satisfies it moves to next itearation without perform anything.
					 }
				     else {// if(rev.charAt((input/2)-1)=='}'&& rev.charAt(input/2)=='}') if this condion fails all will be comes to this else part
				    	 //example {{{{,{}{{,{{{}
					 temp+=rev.charAt(i);//add elements one by one ex "{"+"{"
					 count+=1;//for each addition tghe count will be increased;
					 }
				 }
			 }
			 if(count>input/2) { //count >1 reason for front must have more than one open braces "{" to satisfy condition.
				 System.out.println(rev);
				 front.add(rev);//add the results in the front list.
				 
			 }
		   }
		   }
			 else if(input%2==0) {//for even input values
			 if(rev.charAt(0)=='{') { //same as odd
			 for(int i=0;i<rev.length();i++) {
				 if(rev.charAt(i)=='{') {
				 if(rev.charAt((input/2)-1)=='}'&&rev.charAt(input/2)=='}') {
	// "{}}{" this condtion for front looks satisfied but it is not a correct one this should be filterded so (4/2)-1==} and 4/2==} means index 1,2==};
					 continue;
				 }
				 else {
					 temp+=rev.charAt(i);
					 count+=1;
					 }
				 }
			 }
			 if(count>=input/2) {//count must be greater than 1
				 System.out.println(rev);
				 front.add(rev);
			 }
		   }
		   }
		   }
		}//
		   else {// this one for loop w==1
			   
			   for(String rev:li2) { //gives value from li2 to variable rev one by one.
					 count=0;
					 if(input%2!=0) {
					 if(rev.charAt(0)=='}') {//here the value is reversed because we changed value for x and y
						// example "{{{}" to "}}}{" so chatAt(0) is "}".
					 for(int i=0;i<rev.length();i++) {
						 if(rev.charAt(i)=='}') { //checks value one by one
							 if(rev.charAt((input/2)-1)=='{'&& rev.charAt(input/2)=='{') {
							 continue;
							 }
						     else {
							 temp+=rev.charAt(i);
							 count+=1;
							 }
						 }
					 }
					 if(count>input/2) {
						 sb=new StringBuilder(rev);//we need to reverse value to make it match to the front part
						 //example in the above we changed "{{{}" to "}}}{" this is not correct so need to reverse this "}}}{" 
						 //after reversed "{}}}" now condition matches "{{{}":"{}}}"
						 System.out.println(sb.reverse());
						 back.add(sb); //stores the reversed value and the datatype for the list is Object because we are storing the String value here.
						 
					 }
				   }
				   }
					 else if(input%2==0) {
					 if(rev.charAt(0)=='}') {
					 for(int i=0;i<rev.length();i++) {
						 if(rev.charAt(i)=='}') {
						 if(rev.charAt((input/2)-1)=='{'&&rev.charAt(input/2)=='{') {
							 continue;
						 }
						 else {
							 temp+=rev.charAt(i);
							 count+=1;
							 }
						 }
					 }
					 if(count>=input/2) {
						 sb=new StringBuilder(rev);
						 System.out.println(sb.reverse());
						 back.add(sb);
					 }
				   }
				   }
				   }
			   
		   }
		}
		w++; //incrementing the loop value from w==0 to w==1
		System.out.println("--------------------------");
	}
		System.out.println("possible combinations");
		for(int i=0;i<front.size();i++) { //take length of any one loop because both front and back have the same size
			System.out.println(front.get(i)+"  :  "+back.get(i));//print results in the format {{{{  :  }}}}
		}	
		
	}
}
