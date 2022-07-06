package org.example;

import java.util.Scanner;

public class Rise extends State {
    @Override
    void enter() {
        System.out.println("Now in the Rise state");
    }

    @Override
    void update() {
        while (true) {
            System.out.println("1. Time to exit.");
            var scanner = new Scanner(System.in);
            var choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    current = chase;
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
