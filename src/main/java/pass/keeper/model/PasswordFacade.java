package pass.keeper.model;

import pass.keeper.generators.PasswordGenerator;

public class PasswordFacade {

    private PasswordGenerator passwordGenerator;

    public PasswordEntry generatePassword(String website, String login, int length) {
        String password = PasswordGenerator.getPassword(length);
        return new PasswordEntry(website, password, login);
    }
}