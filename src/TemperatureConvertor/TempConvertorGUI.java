package TemperatureConvertor;

import javax.swing.*;
import java.util.Scanner;

public class TempConvertorGUI {
    public static void main(String[] args) {
        // Declare variables
        double tempCelsius, tempFarhenheit;

        // Create a Scanner object
        Scanner scanTemp = new Scanner(System.in);

        // Ask user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
        tempCelsius = scanTemp.nextDouble();

        // Convert the temperature
        tempFarhenheit = (tempCelsius * 1.8) + 32;

        // Display the result
        JOptionPane.showMessageDialog(null, "Temperature in Farhenheit: " + tempFarhenheit);
    }
}
