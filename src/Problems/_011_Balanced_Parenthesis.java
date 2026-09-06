package Problems;
import java.util.*;
public class _011_Balanced_Parenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc .next();
		Stack<Character> stk =new Stack<>();
		int flag=1;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
				stk.push(c);
			else {
				if(stk.isEmpty()) {
					flag=0;
				}
				else {
					char ch=stk.pop();
					if((c==')'&&ch!='(')||(c=='}'&&ch!='{')||(c==']'&&ch!='[')) {
						flag=0;
					}
				}
			}
		}
		
		if(flag==1&&stk.isEmpty()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("not Valid");
		}

	}

}
