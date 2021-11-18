

public class LargestOfNumbers {

    public void largestOfNum(int num1, int num2){
        if(num1<num2)
            System.out.println("Largest number is: " + num2);
        else
            System.out.println("Largest number is: " + num1);
    }


    public void largestOfNum(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            System.out.println("Largest number is: " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("Largest number is: " + num2);
        else
            System.out.println("Largest number is:  " + num3);
    }


    public static void main(String[] args) {
        LargestOfNumbers obj = new LargestOfNumbers();
        obj.largestOfNum(9,6);
        obj.largestOfNum(3,2,3);
    }

}
