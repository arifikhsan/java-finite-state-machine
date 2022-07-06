package org.example;

import java.util.Scanner;

public class Die extends State {
    @Override
    void enter() {
        System.out.println("Now in the Die state");
    }

    @Override
    void update() {
        while (true) {
            System.out.println("1. Eyes reach Center Room.");
            var scanner = new Scanner(System.in);
            var choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    current = rise;
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
