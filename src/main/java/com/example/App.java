package com.example;

public class App {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        App app = new App();
        int number = 7;
        System.out.println(number + (app.isEven(number) ? " is even" : " is odd"));
    }
}
