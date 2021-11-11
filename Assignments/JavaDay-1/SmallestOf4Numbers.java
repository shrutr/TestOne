import java.util.Scanner;

public class SmallestOf4Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int i = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int j = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int k = sc.nextInt();
        System.out.println("Enter Fourth Number: ");
        int l = sc.nextInt();

        int small =i;

        if (small > j ){
            small =j;
        }
        if (small > k ){
            small = k;
        }
        if (small > l){
            small =l;
        }
            System.out.println("Smallest Number is: " + small);
        }
}
