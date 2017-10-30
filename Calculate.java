import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        double x;
        double y;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        x = sc.nextDouble();
        System.out.println("Введите второе число:");
        y = sc.nextDouble();
        System.out.println("Введите оператор:");
        operation = sc.next();
        operation.trim();
        switch (operation) {
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", x, y, calculate.sum(x, y));
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", x, y, calculate.sub(x, y));
                break;
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", x, y, calculate.multy(x, y));
                break;
            case "/":
                System.out.printf("%.2f / %.2f = %.2f", x, y, calculate.div(x, y));
                break;
            case "^":
                System.out.printf("%.1f в степени %.1f = %.1f", x, y, calculate.expon(x, y));

        }

    }


    private double sum(double x, double y) {
        return x + y;
    }

    private double sub(double x, double y) {
        return x - y;
    }

    private double multy(double x, double y) {
        return x * y;
    }

    private double div(double x, double y) {
        return x / y;
    }

    private double expon(double x, double y) {
        return Math.pow(x, y);
    }
    
}