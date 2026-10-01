package Problems;

public class _093_Swap_num {

	public static void main(String[] args) {
		int input=12345;
		int first=input,dig=0;
		int temp=input;
		int last=input%10;
		while(first/10>0) {
			first/=10;
			dig++;
		}
		int pow=1;
		for(int i=0;i<dig;i++) {
			pow*=10;
		}
		int mid=(input%pow)/10;
		int res=last*pow+mid*10+first;
		System.out.println(res);
	}
}
