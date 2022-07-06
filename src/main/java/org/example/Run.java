package org.example;

import java.util.Scanner;

public class Run extends State {
    @Override
    void enter() {
        System.out.println("Now in the Run state");
    }

    @Override
    void update() {
        while (true) {
            System.out.println("1. Player eats Ghost.");
            System.out.println("2. Power Pellet wears off.");
            var scanner = new Scanner(System.in);
            var choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    current = die;
                    return;
                }
                case 2 -> {
                    current = chase;
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
