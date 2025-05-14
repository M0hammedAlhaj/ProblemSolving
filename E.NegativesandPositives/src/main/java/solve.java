import java.util.Arrays;
import java.util.Scanner;

public class solve {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();  // Number of test cases

            while (t-- > 0) {
                int n = sc.nextInt();  // Size of the array
                int[] a = new int[n];
                long sum = 0;
                int negs = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    if (a[i] < 0) {
                        negs++;
                        a[i] = -a[i];  // Convert to positive
                    }
                    sum += a[i];
                }

                Arrays.sort(a);

                if ((negs & 1) == 1) {
                    sum -= 2L * a[0];  // Subtract twice the smallest element if odd number of negatives
                }

                System.out.println(sum);
            }

            sc.close();
        }

}
