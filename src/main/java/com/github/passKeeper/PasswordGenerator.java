package com.github.passKeeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class PasswordGenerator {

    private static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private boolean useLowerCase;
    private boolean useUpperCase;

    private PasswordGenerator() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }

    private PasswordGenerator(PasswordGeneratorBuilder builder) {
        this.useLowerCase = builder.useLowerCase;
        this.useUpperCase = builder.useUpperCase;
    }

    public static class PasswordGeneratorBuilder {

        private boolean useLowerCase;
        private boolean useUpperCase;

        public PasswordGeneratorBuilder() {
            this.useLowerCase = false;
            this.useUpperCase = false;
        }

        public PasswordGeneratorBuilder useLower(boolean useLower) {
            this.useLowerCase = useLower;
            return this;
        }
        public PasswordGeneratorBuilder useUpper(boolean useUpper) {
            this.useUpperCase = useUpper;
            return this;
        }

        public PasswordGenerator build() {
            return new PasswordGenerator(this);
        }
    }


    public String generate(int length) {
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        List<String> charCategories;
        charCategories = new ArrayList<>(2);
        if (useLowerCase) {
            charCategories.add(lowerCaseLetters);
        }
        if (useUpperCase) {
            charCategories.add(upperCaseLetters);
        }

        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }

}