
public class LongestStr {
	public static void main(String[] args) {
		String s="rasasdfrasa";
		String ans="";
		for(int i=0;i<1;i++) {
			for(int j=i+1;j<s.length();j++) {
				
				String a= ""; 
				int x=i,y=j;
				while(y<s.length()&&s.charAt(x)==s.charAt(y)) {
					a+=s.charAt(x);
					x++;
					y++;
					
				}
				if(ans.length()<a.length()) {
					ans=a;
				}
			}
		}
		System.out.println(ans);
	}
}
