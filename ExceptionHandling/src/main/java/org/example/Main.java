package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Calculator calculator = new Calculator();
        int i = 0;
        try {
            i = calculator.add(4, -120);
            System.out.println("Response is : " + i);
        } catch (NegativeValueException e) {
            System.out.println("In NegativeValueException block");

        } catch (MoreThan100Exception e) {
            System.out.println("In MoreThan100Exception block");

        }

        System.out.println("Addition is : " + i);
    }
}
