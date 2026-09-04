package Problems;
import java.util.*;
public class _009_Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,count=0,pow=1,rem=0;
		int temp=n;
		while(n>0) {
			count++;
			n/=10;
		}
		//System.out.println(count);
		n=temp;
		while(n>0) {
			rem=n%10;
			for(int i=0;i<count;i++) {
				pow=pow*rem;
			}
			sum+=pow;
			pow=1;
			n/=10;
			
		}
		//System.out.println(sum);
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
