package TemperatureConvertor;

// Import libraries
import javax.swing.*;

public class TempConvertorConsole {
    public static void main(String[] args) {
        // Declare variables
        double tempCelsius, tempFarhenheit;
        int opt;

        // Main Menu
        JOptionPane.showMessageDialog(null, "Welcome to the Temperature Convertor App", "Temperature Convertor", JOptionPane.DEFAULT_OPTION);

        // Ask user to enter temperature in Celsius
        opt = Integer.parseInt(JOptionPane.showInputDialog("1. Celsius to Farhenheit\n2. Farhenheit to Celsius\n3. Exit\nEnter your choice: "));

        // Menu
        switch (opt) {
            case 1:
                tempCelsius = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Celsius: "));
                tempFarhenheit = (tempCelsius * 1.8) + 32;
                JOptionPane.showMessageDialog(null, "Temperature in Farhenheit: " + tempFarhenheit);
                break;
            case 2:
                tempFarhenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Farhenheit: "));
                tempCelsius = (tempFarhenheit - 32) / 1.8;
                JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + tempCelsius);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Goodbye!");
                return;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option!");
                return;
        }
    }
}