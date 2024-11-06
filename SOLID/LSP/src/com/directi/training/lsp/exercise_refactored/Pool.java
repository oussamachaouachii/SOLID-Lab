package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        RealDuck donaldDuck = new RealDuck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        
        electricDuck.turnOn();  // Ensure the electronic duck is turned on before use

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}