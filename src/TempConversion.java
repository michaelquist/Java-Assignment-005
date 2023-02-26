/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 02/23/2023
 */

import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertCF(double celsius) {
        return (celsius * (9.0 / 5)) + 32.0;
    }

    public static double convertCK(double celsius) {
        return celsius + 273.15;
    }

    public static double convertFC(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertFK(double fahrenheit) {
        return convertCK(convertFC(fahrenheit));
    }

    /**
     * The access modifier is 'public'. It is an object method. It's not a class, since it is contained in a class already.
     * Its return type is 'double'. It takes a 'double' value of the variable 'fahrenheit' which is defined by an instance
     * of the method 'convertC2K' which has been passed the arguments 'convertF2C' multiplied by 'fahrenheit'.
     */
    public static double convertKC(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertKF(double kelvin) {
        return convertKC(kelvin) * (9.0 / 5.0) + 32.0;
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    /**
     * The access modifier is public. It is an object method, not a class, since it is contained inside of a class already.
     * Its return type is 'String'. It does not require any parameters. I don't understand how this method executes. I see that
     * it prints four statements. I think the '%n' makes a line break. I'm confused about why the numbers are all the same. I
     * don't know what, if anything, is different about these format specifiers.
     */

    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String from = getUnitChoice();
            if (from.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            String to = getUnitChoice();
            if (to.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            String caseStr = from + to;
            System.out.println("Please enter the starting number in degrees.");
            String num = (scanner.nextLine());
            double value = Double.parseDouble(num);
            double convertedValue = 0.0;
            String result = "";
            switch (caseStr) {
                case "CF":
                    convertedValue = convertCF(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                case "CK":
                    convertedValue = convertCK(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                case "FC":
                    convertedValue = convertFC(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                case "FK":
                    convertedValue = convertFK(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                case "KC":
                    convertedValue = convertKC(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                case "KF":
                    convertedValue = convertKF(value);
                    result = "Result " + Double.toString(value) +"°"+ from + " is " + Double.toString(convertedValue) +"°"+ to;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("No Match");
            }
        }
    }
}









