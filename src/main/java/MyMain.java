import java.util.Arrays;
import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        int median = arr[1];
        return median; // REPLACE WITH YOUR CODE
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b > a){
            a = b;
        }
        return a; // REPLACE WITH YOUR CODE
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt(a*a + b*b);
        return c; // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
        System.out.println("What command would you like to carry out?");
        String command = scan.next();
        if (command.equals("median")){
            System.out.println("What is your first number?");
            int a = scan.nextInt();
            System.out.println("What is your second number?");
            int b = scan.nextInt();
            System.out.println("What is your third number?");
            int c = scan.nextInt();
            System.out.println("The median is "+ median(a, b, c));
        }
        else if(command.equals("magnitude")){
            System.out.println("What is your first number?");
            int a = scan.nextInt();
            System.out.println("What is your second number?");
            int b = scan.nextInt();
            System.out.println("The magnitude is "+magnitude(a, b));
        }
        else{
            System.out.println("What is your first number?");
            int a = scan.nextInt();
            System.out.println("What is your second number?");
            int b = scan.nextInt();
            System.out.println("The length of the hypotenuse is "+ pythagoras(a, b));
        }
        scan.close();
    }
}
