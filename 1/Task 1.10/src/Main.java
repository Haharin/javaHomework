import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String INPUT_FILE_NAME = "inputFile.txt";
    public static final String OUTPUT_FILE_NAME = "outputFile.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String line, strToFind;
        List<String> stringArrayList = new ArrayList<>();
        System.out.print("Введите строку для поиска в файле: ");
        strToFind = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {

            while ( (line = br.readLine()) != null ) {
                stringArrayList.add(line);
            }


            try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {

                for (String str: stringArrayList) {
                    String[] tempStr = str.split(" ");
                    for (String str2: tempStr) {
                        if(str2.contains(strToFind)){
                            bw.write(str2 + " ");
                        }
                    }
                }

            } catch ( IOException e) {
                e.printStackTrace();
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }

    }
}
