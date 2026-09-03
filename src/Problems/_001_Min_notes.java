package Problems;
import java.util.*;
public class _001_Min_notes {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int den[] = {2000,500,200,100,50,20,10,5,1};
		for(int amt: den) {
			if(n>=amt) {
				int count=n/amt;
				n%=amt;
				System.out.println(amt+" : "+count);
			}
		}
	}
}
