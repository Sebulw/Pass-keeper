package pass.keeper.files;

import com.opencsv.CSVWriter;
import pass.keeper.model.PasswordEntry;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import static com.opencsv.CSVWriter.*;

class PasswordEntryFileWriter {

    private static String PATH = "C:\\PasswordManager\\storage";


    void writeToFile(String path, List<PasswordEntry> passwordEntries) throws URISyntaxException, IOException {
        CSVWriter csvWriter = new CSVWriter(
                new FileWriter(Paths.get(PATH + "\\" + path).toFile(), true), ';',
                DEFAULT_QUOTE_CHARACTER,
                NO_ESCAPE_CHARACTER,
                DEFAULT_LINE_END);
        for (PasswordEntry passwordEntry : passwordEntries) {
            csvWriter.writeNext(passwordEntry.toArray());
        }
        csvWriter.close();
    }

}