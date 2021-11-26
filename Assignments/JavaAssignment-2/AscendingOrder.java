
import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int[] arr = new int[4];
        for (int index = 0; index < 4; index++) {
            arr[index] = sc.nextInt();
        }

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }

            }
            System.out.print(arr[i] + " ");
        }

    }
}
