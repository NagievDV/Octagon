package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an Octagon object with side = 5
        Octagon octagon1 = new Octagon(5);

        // Display area and perimeter
        System.out.println("Площадь: " + octagon1.getArea());
        System.out.println("Периметр: " + octagon1.getPerimeter());

        // Clone the octagon
        Octagon octagon2 = octagon1.clone();

        // Compare the two objects
        int comparison = octagon1.compareTo(octagon2);
        System.out.println("Результат сравнения: " + comparison);
    }
}