package Problems;

public class _091_Strong_Number {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int n=0,fact=1,sum=0;
		while(temp>0) {
			n=temp%10;
			while(n>0) {
				fact*=n;
				n--;
			}
			sum+=fact;
			fact=1;
			n=0;
			temp/=10;
		}
		
			System.out.println(sum==num);
		
		
	}

}
