package edu.sfsu.app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a side of a triangle: ");
            list.add(scanner.nextDouble());
        } while(list.size() < 3);
    }
}