package com.github.passKeeper;

public class PasswordGeneratorBuilder {

    boolean useLowerCase;
    boolean useUpperCase;
    boolean useNumbers;
    boolean useSpecialSigns;

    public PasswordGeneratorBuilder() {
        this.useLowerCase = false;
        this.useUpperCase = false;
        this.useNumbers = false;
        this.useSpecialSigns = false;
    }

    public PasswordGeneratorBuilder useLower(boolean useLower) {
        this.useLowerCase = useLower;
        return this;
    }
    public PasswordGeneratorBuilder useUpper(boolean useUpper) {
        this.useUpperCase = useUpper;
        return this;
    }
    public PasswordGeneratorBuilder useNumbers(boolean useNumbers) {
        this.useNumbers = useNumbers;
        return this;
    }
    public PasswordGeneratorBuilder useSpecialSigns(boolean useSpecialSigns) {
        this.useSpecialSigns = useSpecialSigns;
        return this;
    }

    public PasswordGenerator build() {
        return new PasswordGenerator(this);
    }
}