package Problems;
import java.util.*;
public class _010_Decimal_To_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		String s="";
		int rem=0,div=0;
		while(n>0) {
			rem=n%2;
			s=(rem)+s;
			n/=2;
		}
		System.out.println(s);
		

	}

}
