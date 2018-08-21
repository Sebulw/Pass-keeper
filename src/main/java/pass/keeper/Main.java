package pass.keeper;


import pass.keeper.generators.PasswordGenerator;
import pass.keeper.generators.PasswordGeneratorBuilder;

public class Main {
    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGeneratorBuilder()
                .useLower(true)
                .useUpper(true)
                .useNumbers(false)
                .useSpecialSigns(false)
                .build();
        String password = passwordGenerator.generate(20);

        System.out.println(password);


    }
}
