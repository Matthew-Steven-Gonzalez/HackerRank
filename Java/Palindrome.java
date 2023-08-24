import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        StringBuilder B = new StringBuilder();

        B.append(A);

        B.reverse();

        if (A.equals(B.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
