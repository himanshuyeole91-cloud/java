import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Interpretation: Underweight");
        } else if (bmi < 25) {
            System.out.println("Interpretation: Normal");
        } else if (bmi < 30) {
            System.out.println("Interpretation: Overweight");
        } else {
            System.out.println("Interpretation: Obese");
        }

        scanner.close();
    }
}