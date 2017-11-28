import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "inputFile.txt";

    public static void main(String[] args) {

    String line = null;
    List<String> stringArrayList= new ArrayList<String>();

    try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

        int lineCount = 0;
        int lengthOfAllLines = 0;
        while ( (line = br.readLine()) != null ) {
            stringArrayList.add(line);
            System.out.println("Длина строки " + (lineCount + 1) + " = " + stringArrayList.get(lineCount).length());
            lengthOfAllLines += stringArrayList.get(lineCount).length();
            lineCount++;
        }

        System.out.println( "Суммарная длина всех " + lineCount + " строк = " + lengthOfAllLines );

    } catch ( IOException e) {
        e.printStackTrace();
    }

    }
}
