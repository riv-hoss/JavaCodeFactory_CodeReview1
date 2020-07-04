public class CodeReview1_Q3_Q5 {

    public static double calculateRectArea (double length, double width) {
        double area = length * width;
        return area; // area returned since it was asked in the question
    }


    public static void main(String[] args) {
        // first rectangle dimensions
        double lengthOne = 30.0;
        double widthOne = 20.0;
        // second rectangle dimensions
        double lengthTwo = 50.0;
        double widthTwo = 40.0;
        
        // calculating areas and printing them out
        double areaOne = calculateRectArea(lengthOne, widthOne);
        double areaTwo =  calculateRectArea(lengthTwo, widthTwo);
        System.out.printf("Area of a rectangle with length of %.2fcm and with " +
                "of %.2fcm is %.2f cm\u00B2.\n", lengthOne, widthOne, areaOne);
        System.out.printf("Area of a rectangle with length of %.2fcm and with " +
                "of %.2fcm is %.2f cm\u00B2.\n", lengthTwo, widthTwo, areaTwo);


        // Question 5 - several method calls
        // Question 5 - several method calls
        System.out.println("\n------------------Question 5 - call calculateRectArea()" +
                " method with different arguments.------------------");
        System.out.println("\n-------- First arguments are 3.00 & 2.10 --------");
        System.out.printf("Area is: %.2f cm\u00B2\n", calculateRectArea(3.0, 2.1));
        System.out.printf("\n-------- Second arguments are 12.50 & 8.80--------\n");
        System.out.printf("Area is: %.2f cm\u00B2\n", calculateRectArea(12.5, 8.8));
        System.out.printf("\n-------- Third arguments are 2.20 & 0.70 --------\n");
        System.out.printf("Area is: %.2f cm\u00B2\n", calculateRectArea(2.2, 0.7));

    }
}
