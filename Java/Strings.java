import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String lexi;
        /* Enter your code here. Print output to STDOUT. */
        int sums = A.length() + B.length();

        if (A.compareTo(B) > 0) {
            lexi = "Yes";
        } else {
            lexi = "No";
        }

        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sums);
        System.out.println(lexi);
        System.out.println(capA + " " + capB);
    }
}
