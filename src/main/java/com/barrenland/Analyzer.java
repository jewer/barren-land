package com.barrenland;

public class Analyzer {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new Analyzer().getGreeting());
    }
}
