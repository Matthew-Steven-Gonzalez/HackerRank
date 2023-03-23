import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int N = sc.nextInt();
        if (N % 2 != 0 || N >= 6 || N <= 20){
            System.out.println("Weird");
        }
        
        else if(N >= 2 || N <= 5 || N >= 20){
            System.out.println("Not Weird");
        }


        int i = sc.nextInt();
        
        String s = sc.next();
        
        double d = sc.nextDouble();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        


        sc.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int Q = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int v = 1; v <= 10; v++){
            System.out.println(Q + " x " + v + " = " + (Q*i));

        }

        bufferedReader.close();
    } 
}