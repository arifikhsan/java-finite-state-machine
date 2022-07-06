package org.example;

import java.util.Scanner;

public class Chase extends State {

    @Override
    void enter() {
        System.out.println("Now in the Chase state");
    }

    @Override
    void update() {
        while (true) {
            System.out.println("1. Player dies.");
            System.out.println("2. Player eats Power Pellet.");
            var scanner = new Scanner(System.in);
            var choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    current = move;
                    return;
                }
                case 2 -> {
                    current = run;
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
