package com.example.MyOnboardingClass;

public class MyOnboarding {
    public static void main(String[] args) {
        System.out.println("Hello Leo");
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "todo irá bien,";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "pequeña";
    }
}
