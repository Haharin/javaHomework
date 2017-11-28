import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String FILE_NAME = "outputFile.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<String> stringArrayList = new ArrayList<String>();
        for (int i = 0; i < 3; i++){
            stringArrayList.add(scanner.nextLine());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (String str: stringArrayList) {
                String[] tempStr = str.split(" ");
                for (String str2: tempStr) {
                    bw.write(str2 + "\n");
                }
            }
            bw.close();

        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
