import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    // moreInput() asks the user if they would like to continue inputting BMIs
    public static boolean moreInput() {

        System.out.println("Would you like to calculate a BMI? Type 'Y' for yes, or type 'N' for no.");

        Scanner another_input = new Scanner(System.in);
        char c = another_input.next().charAt(0);
        /* Lines 30 - 41 serve as a precaution in case the user inputs
        a lowercase 'y' or 'n' */
        if(c == 'y'){
            c = 'Y';
        }
        else if(c == 'n'){
            c = 'N';
        }
        if (c == 'Y') {
            return true;
        }
        else if (c == 'N') {
            return false;
        }
        return false; // if user did not input either a 'Y' or an 'N' (upper or lowercase), it is assumed that they do not want to continue
    }

    // getUserHeight() asks the user to input a height and ensures it is not negative
    public static double getUserHeight() {

        System.out.println("Enter your height in inches. Positive values only.");

        Scanner input_height = new Scanner(System.in);
        double inches = input_height.nextDouble();

        while(inches<0)
        {
            System.out.println("Enter your height in inches. Positive values only.");
            input_height = new Scanner(System.in);
            inches = input_height.nextDouble();
        }

        // Line 61 calls Scanner's nextLine() to clear the input buffer
        String clear_input_buffer = input_height.nextLine();

        return inches;
    }

    // getUserWeight() asks the user to input a weight and ensures it is not negative
    public static double getUserWeight(){

        System.out.println("Enter your weight in pounds. Positive values only.");

        Scanner input_weight = new Scanner(System.in);
        double pounds = input_weight.nextDouble();

        while(pounds<0)
        {
            System.out.println("Enter your weight in pounds. Positive values only.");
            input_weight = new Scanner(System.in);
            pounds = input_weight.nextDouble();
        }

        // Line 82 calls Scanner's nextLine() to clear the input buffer
        String clear_input_buffer = input_weight.nextLine();

        return pounds;
    }

    // displayBmiInfo prints the BMI and category of the user
    public static void displayBmiInfo (BodyMassIndex bmi){

        System.out.printf("Your BMI is: %.1f%nYour respective category is: %s%n", bmi.bmi_calculation, bmi.bmi_category);
    }
    // displayBmiStatistics prints the average of the inputted BMIs
    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){

        int i;
        double total = 0;
        double average_bmi;
        BodyMassIndex individual_bmi;

        /* if the user indicates that they do not want to calculate a BMI when asked initially,
        displayBmiStatistics will return to its caller to prevent access of unallocated memory */
        if(bmiData.isEmpty()) {
            System.out.println("Have a nice day!");
            return;
        }

        /* individual_bmi (type BodyMassIndex) runs through the loop and
        is assigned the components of each index of the array. By creating
        a variable of type double, the double value of bmi_calculation is isolated.
        Once the loop ends, total will have the sum of all calculated BMIs.
         */
        for(i=0;i<bmiData.size();i++) {
            individual_bmi = bmiData.get(i);
            total += individual_bmi.bmi_calculation;
        }

        average_bmi = total / bmiData.size();
        System.out.printf("The average BMI score of the data inputted is %.1f.", average_bmi);
    }
}