package Problems;
import java.util.*;
public class _008_Anagram_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String s=str1.toLowerCase();
		String t=str2.toLowerCase();
		
		if(s.length()!=t.length()) {
			System.out.println("Not Anagram");
		}
		char[] a=s.toCharArray();
		char[] b=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}
