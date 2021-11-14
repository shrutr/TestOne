import java.util.Scanner;

public class Calculator {

    public static void runCalculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        if(!sc.hasNextDouble()){
            System.out.println("Entered number is not a Valid Number!!");
            return;
        }
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        if(!sc.hasNextDouble()){
            System.out.println("Entered number is not a Valid Number!!");
            return;
        }
        double num2 = sc.nextDouble();

        System.out.println("Enter the Operation to be Performed: \n" +
                "Addition: + \n" +
                "Subtraction: - \n" + "Multiplication: * \n" + "Division: / \n");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+': {
                System.out.println("Addition of 2 numbers: " + addition(num1, num2));
                break;
            }
            case '-': {
                System.out.println("Subtraction of 2 numbers: " + subtraction(num1, num2));
                break;
            }

            case '*': {
                System.out.println("Multiplication of 2 numbers: " + multiplication(num1, num2));
                break;
            }

            case '/': {
                System.out.println("Division of 2 numbers: " + division(num1, num2));
                break;
            }

            default:{
                System.out.println("Entered operation is Invalid.");
                return;
            }
        }

        System.out.println("Exit? Y/N");
        char ch1 = sc.next().charAt(0);
        if (ch1 == 'Y' || ch1 == 'y')
            System.exit(0);
    }
    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        while(true){
            runCalculator();
        }

    }
}