package Problems;

public class _50_Leader_right {

	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		int[] a=new int[6];
		int sum=0;
	
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			a[i]=sum-arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a[i]) {
				System.out.println(i);
			}
		}
	}

}
