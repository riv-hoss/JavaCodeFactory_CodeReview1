import java.util.Arrays;
public class CodeReview1_Bonus_1 {
    public static double calculateRectArea (double length, double width) {
        double area = length * width;
        return area; // area returned since it was asked in the question
    }
    public static void main(String[] args) {
        double[][] rectDimensions = {
                {2,1},{7,5},{3,1},{2.2,1.6},{8.8,5.4},
                {32,5},{55,32},{12.1,3.6},{21,4.4},{0.74,0.52}

        };
        double[] rectAreas = new double[10];
        for (int i = 0; i < 10; i++) {
            double eachArea = calculateRectArea(rectDimensions[i][0], rectDimensions[i][1]);
                rectAreas[i] = Math.round(eachArea*100.00)/100.00;

        }
        System.out.println("Areas are: " + Arrays.toString(rectAreas));

    }
}
