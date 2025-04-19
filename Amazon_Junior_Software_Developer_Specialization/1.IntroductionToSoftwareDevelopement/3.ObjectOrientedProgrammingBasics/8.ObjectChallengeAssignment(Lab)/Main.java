public class Main {
    public static void main(String[] args) {
        // Variables to store the weight and height values
        double weight, height;
        // Variable to hold the BMI value
        double bmi = 0;
        // Variable to hold the BMI system value obtained from user input
        String bmiSystem;
        // Variable to hold the BMI category determined by this BMI Calculator
        String bmiCategory;

        // Todo 6: Initialize the reference variable UserInput to create an object UserInput
        // Please initialize this reference variable to create an object of the UserInput class
        UserInput userInput = new UserInput();
        // TODO 7: Initialize the refernce variable BMICalculator to create an object BMICalculator
        // Please initialize this reference variable to create an object of the BMICalculator class
        BMICalculator bmiCalculator = new BMICalculator();

        // Invoke the obtainBMISystem() of the UserInput class
        bmiSystem = userInput.obtainBMISystem();

        // TODO 8: Complete the body of the switch statement
        // A Switch statement that determines how user input for weight and height should be obtained based on the BMI system
        switch (bmiSystem.toUpperCase()) {
            // The case of IMPERIAL BMI system
            case "IMPERIAL":
                // Please invoke the obtainWeight() method of the UserInput class and assign it to the variable weight
                weight = userInput.obtainWeight("IMPERIAL");
                // Please invoke the obtainHeight() method of the UserInput class and assign it to the variable height
                height = userInput.obtainHeight("IMPERIAL");
                // Please invoke the calculateBmiImperial() method of the BMICalculator class
                bmi = bmiCalculator.calculateBmiImperial(weight,height);
                // Break out of the switch statement
                break;
            // The case of METRIC BMI system
            case "METRIC":
                // Please invoke the obtainWeight() method of the UserInput class and assign it to the variable weight
                weight = userInput.obtainWeight("METRIC");
                // Please invoke the obtainHeight() method of the UserInput class and assign it to the variable height
                height = userInput.obtainHeight("METRIC");
                // Please invoke the calculateBmiMetric() method of the BMICalculator class
                bmi = bmiCalculator.calculateBmiMetric(weight,height);
                // Break out of the switch statement
                break;
            // The case of empty BMI system due to invalid user input
            case "":
                // Please display a message asking the user to enter a valid BMI system in case of invalid input
                System.out.println("Please Enter a valid BMI System as input");
                // Break out of the switch statement
                break;
        }

        // Display the calculated BMI value to the user
        System.out.println("Your BMI is: " + bmi);

        // TODO 9: call getBMICategory() and assing the result to bmiCategory variable
        // Please invoke the getBMICategory() method of the BMICalculator class and assign the result to the bmiCategory variable
        bmiCategory = bmiCalculator.getBMICategory(bmi);

        // Display the BMI category to the user
        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
