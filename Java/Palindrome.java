import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        // string builder to create empty string for reverse string
        StringBuilder B = new StringBuilder();
        // adds the exsisting string to stringbuilder object
        B.append(A);
        // reversed the order of the string
        B.reverse();
        // if logic to check if strings equal each other.
        if (A.equals(B.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
