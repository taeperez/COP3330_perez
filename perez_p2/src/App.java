import java.util.Scanner;

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
    public static boolean moreInput(){
        System.out.println("Would you like to calculate another BMI? Type 'Y' for yes, or type 'N' for no.");
        Scanner another_input = new Scanner(System.in);
        char c = another_input.next().charAt(0);
        if (c == 'Y') {
            return true;
        }
        else if (c == 'N'){
            return false;
        }
        return false; // if user did not input either a 'Y' or an 'N', it is assumed that they do not want to continue
    }
}
