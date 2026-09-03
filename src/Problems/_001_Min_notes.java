package Problems;
import java.util.*;
public class _001_Min_notes {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		while(n>0) {
			if(n/2000>0) {
				int count=n/2000;
				System.out.println("2000 : "+count);
				n=n%2000;
			}
			if(n/500>0) {
				int count=n/500;
				System.out.println("500 : "+count);
				n=n%500;
			}
			if(n/200>0) {
				int count=n/200;
				System.out.println("200 : "+count);
				n=n%200;
			}
			if(n/100>0) {
				int count=n/100;
				System.out.println("100 : "+count);
				n=n%100;
			}
			if(n/50>0) {
				int count=n/50;
				System.out.println("50 : "+count);
				n=n%50;
			}
			if(n/20>0) {
				int count=n/20;
				System.out.println("20 : "+count);
				n=n%20;
			}
			if(n/10>0) {
				int count=n/10;
				System.out.println("10 : "+count);
				n=n%10;
			}
			if(n/5>0) {
				int count=n/5;
				System.out.println("5 : "+count);
				n=n%5;
			}
			if(n/1>0) {
				int count=n/1;
				System.out.println("1 : "+count);
				n=n%1;
			}
		}
	}

}
