package ru.stepup.somelogic;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        doLoop();
    }

    public static void doLoop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
