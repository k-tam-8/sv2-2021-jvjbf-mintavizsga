package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        int sum = -1;
        for (String s : owls) {
            if (s.toLowerCase().contains(county.toLowerCase())) {
                String temp = s.substring(s.indexOf("=") + 1);
                sum = Integer.parseInt(temp);
            }
        }
        if (sum < 0) {
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return sum;
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String s : owls) {
            String temp = s.substring(s.indexOf("=") + 1);
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
}
