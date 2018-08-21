package com.github.passKeeper;

public class Main {
    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGeneratorBuilder()
                .useLower(true)
                .useUpper(true)
                .useNumbers(true)
                .useSpecialSigns(true)
                .build();
        String password = passwordGenerator.generate(20);

        System.out.println(password);
    }
}
