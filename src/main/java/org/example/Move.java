package org.example;

import java.util.Scanner;

public class Move extends State {
    @Override
    void enter() {
        System.out.println("Now in the Move state");
    }

    @Override
    void update() {
        while (true) {
            System.out.println("1. Player respawn.");
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
