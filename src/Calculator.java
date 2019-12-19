import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    private static int calculate;

    public static void main(String[] args) {
        double  num1 = getInt1();
        double  num2 = getInt2();
        char  operation = getOperation();
        double result = calc(num1,num2, (char) operation);
        System.out.println("Result: "+result);

    }
    public static char getOperation() {
        System.out.println("Enter operation:");
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            operation = getOperation();
        }
        return operation;
    }

    public static double  getInt1() {
        System.out.println("Enter number one");
        double  num1 = scan.nextDouble();
        System.out.println(num1);
        return num1;
    }
    public static double  getInt2() {
        System.out.println("Enter number two");
        double  num2 = scan.nextDouble();
        System.out.println(num2);
        return num2;
    }
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Error");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
