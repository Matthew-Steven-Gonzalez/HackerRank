import java.text.NumberFormat;
import java.util.*;

public class CurrencyChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);

        String US = n1.format(payment);

        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        String India = n2.format(payment);

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String China = n3.format(payment);

        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String France = n4.format(payment);

        System.out.println("US: " + US);
        System.out.println("India: " + India);
        System.out.println("China: " + China);
        System.out.println("France: " + France);

    }
}
