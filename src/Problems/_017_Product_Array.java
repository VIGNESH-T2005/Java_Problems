package Problems;
import java.util.*;
public class _017_Product_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] left=new int[size];
		int[] right=new int[size];
		int[] product=new int[size];
		left[0]=1;
		for(int i=1;i<size;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		right[size-1]=1;
		for(int i=size-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<size;i++) {
			product[i]=left[i]*right[i];
		}
		for(int n: product) {
			System.out.println(n);
		}
		}
	}


