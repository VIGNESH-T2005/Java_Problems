package Problems;
import java.util.*;
public class _008_Anagram_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
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
