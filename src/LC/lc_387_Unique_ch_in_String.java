package LC;
import java.util.*;
public class lc_387_Unique_ch_in_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int [] a=new int[26];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++) {
			if(a[s.charAt(i)-'a']==1) {
				System.out.println(i);
				break;
			}
		}
	}
}
