package org.example;

public class StateMachineApp {
    public static void main(String[] args) {
        State.chase = new Chase();
        State.run = new Run();
        State.die = new Die();
        State.move = new Move();
        State.rise = new Rise();
        State.current = State.rise;

        while (true) {
            State.current.enter();
            State.current.update();
        }
    }
}
