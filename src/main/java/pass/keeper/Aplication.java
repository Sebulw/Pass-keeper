package pass.keeper;

import org.apache.log4j.Logger;
import pass.keeper.files.FilesFacade;
import pass.keeper.model.PasswordEntry;
import pass.keeper.view.UserView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Application {

    final static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        logger.info("Info");
        FilesFacade filesFacade = new FilesFacade();
        List<PasswordEntry> entries = filesFacade.getEntries("passwords.txt");
        System.out.println(entries);
        PasswordEntry pass = new PasswordEntry("asdasdsa", "asdasd", "asdas");
        List<PasswordEntry> list = new ArrayList<>();
        list.add(pass);


        filesFacade.writeToFile("passwords.csv", list);

        Scanner skaner = new Scanner(System.in);

        UserView userView = new UserView();


    }
}