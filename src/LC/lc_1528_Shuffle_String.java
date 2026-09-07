package LC;
import java.util.*;

public class lc_1528_Shuffle_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] a = {4, 5, 6, 7, 0, 2, 1, 3};

        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            b[a[i]] = s.charAt(i);
        }

        System.out.println(b);
    }
}
