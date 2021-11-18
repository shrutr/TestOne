import java.util.Scanner;

class MethodOverriding {

    Scanner sc = new Scanner(System.in);

    void sum(){
        System.out.println("Enter 2 Numbers: " );
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum of 2 integers: " + (num1+num2));
    }
}

class Overriding extends MethodOverriding{

        Scanner sc = new Scanner(System.in);

    void sum(){
        System.out.println("Enter 2 words: ");
        String str1 = sc.next().toString();
        String str2 = sc.next().toString();

        System.out.println("String Concatenation: " + str1 +" "+ str2);

    }

}

class Application{

    public static void main(String[] args) {
        MethodOverriding obj1 = new MethodOverriding();
        obj1.sum();

        Overriding obj2 = new Overriding();
        obj2.sum();
    }
}