package Problems;
import java.util.*;
public class _018_Max_Min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int [size];
		int[] res=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int left=0,right=size-1,i=0;
		while(left<=right) {
				if(i%2==0) {
				res[i++]=arr[right--];
				}
				else {
				res[i++]=arr[left++];
				}
			
		}
		System.out.println(res);
	}

}
