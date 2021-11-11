import java.util.Scanner;

public class CheckCharCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        int asc_val = ch;

        if (asc_val >=65 && asc_val <=90){
            System.out.println("Entered Character is Uppercase");
        }
        else if(asc_val >=97 && asc_val <= 122){
            System.out.println("Entered Character is Lowercase");
        }
        else{
            System.out.println("Entered character is not an Alphabet. ");
        }
    }
}
