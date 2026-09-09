package Problems;
import java.util.*;
public class _014_Merge_Two_Arrays {

	public static void main(String[] args) {
		
		int [] a= {1,3,5};
		int [] b= {2,4,6};
		int len= a.length + b.length;
		int []c= new int[len];
		int i=0;
		while(i<len) {
			if(a[i]<b[i]) {
				c[i]=a[i];
				c[i+1]=b[i];
				i++;
			}
			else {
				c[i]=b[i];
				c[i+1]=a[i];
				i++;
			}
		}
		System.out.println(Arrays.toString(c));


	}

}
