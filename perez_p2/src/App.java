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
    
    public static boolean moreInput() {
        System.out.println("Would you like to calculate a BMI? Type 'Y' for yes, or type 'N' for no.");
        Scanner another_input = new Scanner(System.in);
        char c = another_input.next().charAt(0);
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

    public static double getUserHeight() {
        System.out.println("Enter your height in inches. Positive values only.");
        Scanner input_height = new Scanner(System.in);
        double inches = input_height.nextDouble();
        if (inches < 0){
            System.out.println("Negative values are prohibited.");
            getUserHeight();
        }
        String clear_input_buffer = input_height.nextLine();
        return inches;
    }

    public static double getUserWeight(){
        System.out.println("Enter your weight in pounds");
        Scanner input_weight = new Scanner(System.in);
        double pounds = input_weight.nextDouble();
        String clear_input_buffer = input_weight.nextLine();
        return pounds;
    }

    public static void displayBmiInfo (BodyMassIndex bmi){
        System.out.printf("Your BMI is: %.1f%nYour respective category is: %s%n", bmi.bmi_calculation, bmi.bmi_category);
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){
        int i;
        double total = 0;
        double average_bmi;
        BodyMassIndex individual_bmi;
        if(bmiData.isEmpty()) {
            System.out.println("Have a nice day!");
            return;
        }
        for(i=0;i<bmiData.size();i++) {
            individual_bmi = bmiData.get(i);
            total += individual_bmi.bmi_calculation;
        }
        average_bmi = total / bmiData.size();
        System.out.printf("The average BMI score of the data inputted is %.1f", average_bmi);
    }
}