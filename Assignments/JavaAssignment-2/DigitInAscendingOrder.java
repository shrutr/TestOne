import java.util.Arrays;
import java.util.Scanner;

public class DigitInAscendingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        char[] userNum= sc.next().toCharArray();
        Arrays.sort(userNum);

        int arraySize = userNum.length;
        int count;

        for(count = 0; count<arraySize; count++){
            int asciiVal = userNum[count];
            if(asciiVal < 48 || asciiVal > 57 ){
                System.out.println("Entered Number is Invalid!! Please try again!!");
                return;
            }
        }

        for(count = 0; count<arraySize; count++){
            System.out.print(userNum[count]);
        }
    }
}
