package Membros;

import Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraForma {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();



        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("PI value: %.2f%n",Calculator.PI);
        sc.close();
    }

//    public static double volume(double radius) {
//        return 2.0 * PI * radius;
//    }
//
//    public static double circumference(double radius) {
//    return 4.0 * PI * radius * radius * radius / 3.0;
//    }
//segunda forma e fazendo a classe e estanciando o calc
//calc statico
}