import java.util.Scanner;

public class FibonacciSequence {

    //////
    ///Modify the example program to calculate F(n) by the given value of n.
    //////

    public static int fn(int n)
    {
        if (n <= 1) {
            return n;
        }

        return fn(n - 1) + fn(n - 2);
    }
    public static void main(String[] args) {


        System.out.println("FibonacciSequence:");
        System.out.println("Please Enter the index of Fibonacci Sequence");

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        System.out.println("\nThe Fn of " + n + " : " + fn(n));

    }
}
