import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double degreeCelsius;
        double degreeFahrenheit;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your temperature in degrees Celsius:");
        if (in.hasNextDouble()) {
            degreeCelsius = in.nextDouble();
            degreeFahrenheit = degreeCelsius * 1.8 + 32;
            System.out.println(degreeCelsius + " degrees Celsius is " + degreeFahrenheit + " degrees Fahrenheit.");
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for temperature: " + trash);
        }
    }
}
