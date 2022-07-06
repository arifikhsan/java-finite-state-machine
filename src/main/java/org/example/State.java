package org.example;

abstract class State {
    static State chase, run, move, rise, die, current;
    void enter() {}
    void update() {}
}
