
import java.util.Scanner;
public class CodeReview1_Q4_Q5 {

    // Question 4. Method to calculate area of a square
    public static void squareArea (double sideLength) {

        double area = Math.pow(sideLength, 2);
        double perimeter = sideLength * 4;
        System.out.printf("Area of a square with side length of %.2fcm is %.2f cm\u00B2.\n", sideLength, area);
        System.out.printf("Also, its perimeter is %.2f cm.\n", perimeter);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the side length of your desired square: ");
        if (!in.hasNextDouble()) { // check if user input is a number.
            String word = in.next();
            System.err.println(word + " is not a number. " +
                    "Side length of a square cannot be a string!");
            return; // terminate the main method.
        }

        double sideLength = in.nextDouble();
        squareArea(sideLength);

        // Question 5 - several method calls
        System.out.println("\n--------Question 5 - call squareArea() method" +
                " with different arguments.--------");
        System.out.println("\n-------- First argument is 3.00 --------");
        squareArea(3);
        System.out.println("\n-------- Second argument is 12.50 --------");
        squareArea(12.5);
        System.out.println("\n-------- Third argument is 2.20 --------");
        squareArea(2.2);
    }
}
