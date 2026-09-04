package Problems;
import java.util.*;
public class _007_Remove_Duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result="";
		for(int i=0;i<str.length();i++) {
			if(!result.contains(str.charAt(i)+"")) {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);

	}

}
