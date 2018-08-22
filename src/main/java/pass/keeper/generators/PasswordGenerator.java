package pass.keeper.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    private static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String numbers = "0123456789";
    private static final String spiecialSigns = "!@#$%&*()_+-=[]|,./?><";
    private boolean useLowerCase;
    private boolean useUpperCase;
    private boolean useNumbers;
    private boolean useSpecialSigns;

    public PasswordGenerator(PasswordGeneratorBuilder builder) {
        this.useLowerCase = builder.useLowerCase;
        this.useUpperCase = builder.useUpperCase;
        this.useNumbers = builder.useNumbers;
        this.useSpecialSigns = builder.useSpecialSigns;
    }

    public String generate(int length) {
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        List<String> charCategories;
        charCategories = new ArrayList<>(4);
        if (useLowerCase) {
            charCategories.add(lowerCaseLetters);
        }
        if (useUpperCase) {
            charCategories.add(upperCaseLetters);
        }
        if (useNumbers) {
            charCategories.add(numbers);
        }
        if (useSpecialSigns) {
            charCategories.add(spiecialSigns);
        }

        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }

    private static PasswordGenerator passwordGenerator = new PasswordGeneratorBuilder()
            .useLower(true)
            .useUpper(true)
            .useNumbers(true)
            .useSpecialSigns(true)
            .build();

    public static String getPassword(int length) {
        return passwordGenerator.generate(20);
    }

}