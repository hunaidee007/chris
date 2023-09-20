package org.example.runtimeException;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        Calculator  calculator  = new Calculator();
        int i=0;
        try {
            i = calculator.add(1,0);

            System.out.println(i);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown/caught");
        }
        System.out.println("Addition complete!");

    }
}
