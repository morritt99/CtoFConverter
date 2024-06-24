import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the number of gallons of gas in the tank:");
        double tankCapacity = keyboard.nextDouble();

        System.out.println("Enter the fuel efficiency in miles per gallon:");
        double fuelEfficiency = keyboard.nextDouble();

        // Calculate the distance the car can travel with the gas in the tank
        double distance = tankCapacity * fuelEfficiency;
        System.out.println("The car can drive " + distance + " miles.");

        //Calculate the cost per 100 miles
        double exampleDistance = 100;
        double gallonsConsumed = exampleDistance / fuelEfficiency;
        double distanceCost = gallonsConsumed;  double gasPrice = 0;
        System.out.println(exampleDistance + " miles would consume " + gallonsConsumed + " gallons of gas and cost $" + Math.round(distanceCost * 100.00) / 100.0 + " at $" + gasPrice + " per gallon with the specified fuel efficiency.");
    }
}
