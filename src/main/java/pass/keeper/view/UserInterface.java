package pass.keeper.view;

import pass.keeper.files.FilesFacade;
import pass.keeper.model.PasswordEntry;
import pass.keeper.model.PasswordFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    Scanner skaner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("==============================================================================");
        System.out.println("=                                                                            =");
        System.out.println("=                              Hello!                                        =");
        System.out.println("=                                                                            =");
        System.out.println("=               Here is your personal password manager.                      =");
        System.out.println("=                                                                            =");
        System.out.println("==============================================================================");

        System.out.println("==============================================================================");
        System.out.println("=                                                                            =");
        System.out.println("=                            Main Menu                                       =");
        System.out.println("=                                                                            =");
        System.out.println("=              * Press 1 to see your saved passwords                         =");
        System.out.println("=              * Press 2 to generate new password                            =");
        System.out.println("=              * Press 3 to exit program                                     =");
        System.out.println("=                                                                            =");
        System.out.println("==============================================================================");
    }

    public void showPasswords() {
        FilesFacade filesFacade = new FilesFacade();

    }
    public void generateNewPass() {
        FilesFacade filesFacade = new FilesFacade();
        PasswordFacade passwordFacade = new PasswordFacade();
        List<PasswordEntry> entries = filesFacade.getEntries("passwords.txt");
        System.out.println(entries);

        System.out.println("Type service type");
        String website = skaner.nextLine();
        System.out.println("Type your login");
        String login = skaner.nextLine();

        PasswordEntry pass = passwordFacade.generatePassword(website, login, 20);
        List<PasswordEntry> list = new ArrayList<>();
        list.add(pass);
        filesFacade.writeToFile("passwords.csv", list);
    }

}
