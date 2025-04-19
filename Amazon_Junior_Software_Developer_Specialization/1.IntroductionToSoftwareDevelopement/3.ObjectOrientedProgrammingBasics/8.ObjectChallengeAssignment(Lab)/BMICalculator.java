// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // TODO 1: add atributes and complete no-argument constructor
    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    double weightInPounds;
    double heightInInches;
    double weightInkilos;
    double heightInMeters;

    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.weightInPounds = 0.0;
        this.heightInInches = 0.0;
        this.weightInkilos = 0.0;
        this.heightInMeters = 0.0;
    }

    // TODO 2: Complete calculateBmiImperial method
    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and
    // return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightPounds, double heightInches) {
        return (703*weightPounds)/(heightInches*heightInches);
    }

    // TODO 3: complete calculateBmiMetric method
    // Please implement the calculateBmiMetric() method to take in weight and height to calculate
    // and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightKilos, double heightMeters) {
        return weightKilos/(heightMeters*heightMeters);
    }

    // TODO 4: complete the getBMICategory
    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        if (bmi < 18.5){
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }
}
