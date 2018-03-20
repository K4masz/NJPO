import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by K4masz on 2018-01-10.
 */
public class CountWords {


    void countWords() {
        int noWords = 0;
        int noLines = 1;
        char sign;
        String textLine = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            while ((sign = (char) br.read()) != '\uFFFF') {
                if (sign == 13 && (sign = (char) br.read()) == 10)
                    noLines++;
            }
            br.close();
            System.out.println("Lines: " + noLines);


            br = new BufferedReader(new FileReader("input.txt"));

            for (int i = 0; i < noLines; i++) {
                textLine = br.readLine();
                if (!(textLine.matches("\\A\\s*\\z"))) {
                    String[] temp = textLine.split("\\s");
                    noWords += textLine.split("\\s").length;
                }
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException f) {
            System.out.println(f);
        }

        System.out.println("Words: " + noWords);
    }
}
