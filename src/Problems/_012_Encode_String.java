package Problems;
import java.util.*;
public class _012_Encode_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t="";
		int i=0;
		while(i<s.length()) {
			int count=0;
			char c=s.charAt(i);
			while(i<s.length() && s.charAt(i)==c) {
				count++;
				i++;
			}
			System.out.print(c+""+count);
		}

	}

}
