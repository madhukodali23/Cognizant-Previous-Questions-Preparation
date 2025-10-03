import java.util.*;
class Main {
    public static void fuelConsumption(int liters, int distance)
    {
        if (liters <= 0 && distance <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        double litersPer100Km = ((double)liters/distance)*100;
        double miles = distance * 0.6214;
        double gallons = liters * 0.2642;
        double milesPerGallon = miles/gallons;
        System.out.printf("Liters: %.2f\n", litersPer100Km);
        System.out.printf("Miles/gallons: %.2f\n", milesPerGallon);

    }
    public static void main(String[] args) {
        int liters = 20;
        int distance = 150;
        fuelConsumption(liters, distance);
    }
}
