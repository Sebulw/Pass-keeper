package pass.keeper.view;

import pass.keeper.files.FilesFacade;

import java.util.Scanner;

public class UserView {

    Scanner skaner = new Scanner(System.in);

    public UserView() {
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

    public void UserChoice(Scanner skaner) {

        int userChoice = 0;
        try {
            userChoice = Integer.parseInt(skaner.nextLine());
        }catch (NumberFormatException o) {
            System.out.println("Incorrect data! Please use numbers from menu to choose action.");
        }
        switch (userChoice) {
            case 1:
                FilesFacade filesFacade = new FilesFacade();
                filesFacade.readFile("passwords.csv");
                break;
            case 2:

                break;
            case 3:
                break;
        }
    }

}
