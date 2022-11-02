import java.util.Scanner;

public class InfiniteSeries {
    static double ex = 0.0;
    static double fact = 1.0;

    public static void factorial(double input) {
        for (double i = input; i >= 1; i--) {
            fact = fact * i;
        }
    }

    public static void myexp(double n, double x) {
        for(double i = n; i > 1; i--) {
            factorial(i);
            ex = ex + Math.pow(x,i)/fact;
        }
    }

    public static void main(String[] args) {
        System.out.printf("Welcome to Kodiak's Natural Logarithm Calculator!%n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your x: ");
        double inputx = sc.nextDouble();
        System.out.println("Input your i: ");
        double inputi = sc.nextDouble();
        myexp(inputi, inputx);
        System.out.println("Your estimate of e^x is " + ex);
    }
}