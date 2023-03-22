import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
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
        sc.skip("(\r\n|[\n\r\u2028\u2029\u008  5])?");
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

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + (N*i));

        }

        bufferedReader.close();
    } 
}