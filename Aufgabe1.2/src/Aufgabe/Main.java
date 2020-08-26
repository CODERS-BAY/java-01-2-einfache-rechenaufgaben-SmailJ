package Aufgabe;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("#0.00");
        int num1=560;
        int num2=316;
        double broke1=560.50;
        double broke2=316.40;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println("------------------------------------");
        System.out.println(format.format(broke1+broke2));
        System.out.println(format.format(broke1-broke2));
        System.out.println(format.format(broke1*broke2));
        System.out.println(format.format(broke1/broke2));
    }
}
