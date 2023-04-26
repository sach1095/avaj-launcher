package controlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parse {
    int nbtours;
    private List<String> lines;

    public Parse(String fileInput) {
        readFile(fileInput);
        this.nbtours = 0;
        parsefile();
    }

    private void parsefile() {
        int countline = 0;
        for (String line : lines) {
            String[] arguments = line.split(" ");
            for (String argument : arguments) {
                System.out.println("countline = " + countline + " | nb argument = " + arguments.length);
                if (countline == 0 && arguments.length == 1)
                    this.nbtours = Integer.parseInt(argument);
                else if (countline != 0 &&  arguments.length == 5)
                    createObject(arguments);
                else
                    throw new Error("Bad Arguments nb tour.");
                break ;
            }
            countline++;
        }
    }

    private void createObject(String[] arguments) {

    }

    private void readFile(String fileInput) {
        try {
            File file = new File(fileInput);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            this.lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading");
            e.printStackTrace();
        }
    }

    public void printBuffer() {
        System.out.println("Contenu du fichier: ");
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
