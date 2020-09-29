public class BodyMassIndex {
    public double bmi_calculation;
    public String bmi_category;
    public double inches;
    public double pounds;
    //Constructor
    BodyMassIndex(double inches, double pounds) {
        this.inches = inches;
        this.pounds = pounds;
        this.bmi_calculation = (calculate_bmi(inches, pounds));
        this.bmi_category = (category(this.bmi_calculation));
    }
    public double calculate_bmi (double inches, double pounds){
        return ((703 * pounds) / (inches * inches));
    }
    public String category (double bmi_calc){
        if (bmi_calc < 18.5) {
            bmi_category = "Underweight";
            return bmi_category;
        }
        else if (bmi_calc >= 18.5 && bmi_calc <= 24.9){
            bmi_category = "Normal weight";
            return bmi_category;
        }
        else if (bmi_calc >= 25 && bmi_calc <=29.9){
            bmi_category = "Overweight";
            return bmi_category;
        }
        else {
            bmi_category = "Obese";
            return bmi_category;
        }
    }
    @Override
    public String toString() {
        return "" + this.calculate_bmi(inches,pounds);
    }

}
