package Problems;
import java.util.*;
public class _003_palindrome_check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int left=0;
		int right=s.length()-1;
		char[] ch= s.toCharArray();
		int flag=0;
		while(left<right) {  
			if(ch[left]==ch[right]) {
				flag=1;
				left++;
				right--;
			}
			else {
				flag=0;
				
				break;
			}
		}
		if(flag==1)
		System.out.println("palindrome");
		else
			System.out.println("Not palindrome");

	}

}
