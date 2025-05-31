import java.util.*;
public class SubstringCount {

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the main string");
	String mainstr=scan.nextLine();
	System.out.println("enter the sub-string");
	String substr=scan.nextLine();
	int result=occuranceOfSubstring(mainstr,substr);
	System.out.println(result);
}

private static int occuranceOfSubstring(String mainstr, String substr) {
	int count=0;
	int b=substr.length();
	for(int i=0;i<=1;i++) {
		for(int j=0;j <= mainstr.length()-b;j++) {
			if(mainstr.substring(j,j+b).equals(substr)) {
			count++;
			}
		}
		if(i==0) {
			mainstr=reverse(mainstr);
		}
		
	}
	return count;
}

private static String reverse(String mainstr) {
	String reversed="";
	for(int i=mainstr.length()-1;i>=0;i--) {
		 reversed += mainstr.charAt(i);
	}
	return reversed;
}
}
