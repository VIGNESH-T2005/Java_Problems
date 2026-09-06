package LC;
import java.util.*;

public class lc_1528_Shuffle_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] a = new int[s.length()];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        char[] b = new char[s.length()];

        for (int i = 0; i < a.length; i++) {
            b[a[i]] = s.charAt(i);
        }

        System.out.println(b);
    }
}
