package com.github.passKeeper;

public class Main {
    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useLower(true)
                .useUpper(true)
                .build();
        String password = passwordGenerator.generate(12);

        System.out.println(password);
    }
}
