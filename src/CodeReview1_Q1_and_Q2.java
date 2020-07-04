import java.util.Scanner;
public class CodeReview1_Q1_and_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // getting length and width from the keyboard
        System.out.print("Please enter length of your desired rectangle: ");
        double length = in.nextDouble();
        System.out.print("Please also enter width of your desired rectangle: ");
        double width = in.nextDouble();

        // calculating area and printing the result
        double area = length * width;
        System.out.printf("Rectangle with length of %.2fcm and " +
                "width of %.2fcm has area of: %.2f cm\u00B2", length, width, area);
    }
}
