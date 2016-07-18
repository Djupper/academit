import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Prog on 18.07.2016.
 */
public class readAndWrite {
    public static void main(String[] args) throws FileNotFoundException {

        try (
                Scanner scanner = new Scanner(new FileInputStream("D:\\IJ\\academit\\HWRandW\\src\\input.txt"))) {

            StringBuffer data = new StringBuffer();

            while (scanner.hasNextLine()) {

                data.append(scanner.nextLine()).append("\n");

                System.out.println(data.toString());
            }
        }

    }
}