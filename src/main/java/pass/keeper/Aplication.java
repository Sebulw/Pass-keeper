package pass.keeper;

import org.apache.log4j.Logger;
import pass.keeper.view.UserInterface;

import java.io.IOException;

class Application {

    final static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        logger.info("Info");

        UserInterface userInterface = new UserInterface();
        userInterface.showMenu();
        userInterface.generateNewPass();
        userInterface.showPasswords();


    }
}