package LC;
import java.util.*;
public class lc_1480_Running_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] a=new int [size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=a[i];
			a[i]=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}
