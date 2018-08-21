package pass.keeper.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedFileReader extends AbstractFileReader {


    @Override
    public List<String> read(String path) throws IOException {
        File file = getFile(path);
        List<String> passList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String currentLine = br.readLine();

        while (currentLine != null) {
            currentLine = br.readLine();
            passList.add(currentLine);
        }
        return passList;
    }

}

