import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.print("Введите строку с разделителями: ");
        String str = scanner.nextLine();
        System.out.print("Введите разделитель: ");
        String delimiter = scanner.nextLine();
        String[] strArray;
        try{
            if (str.contains(delimiter)){
                strArray = str.split(delimiter);
                for (int i = 0; i < strArray.length; i++){
                    System.out.println(strArray[i]);
                }
            }
            else{
                System.err.println("Probably the wrong delimiter - " + delimiter);
            }
        } catch (Throwable t) {
            System.err.println("Probably the wrong delimiter - " + delimiter);
        }
    }
}
