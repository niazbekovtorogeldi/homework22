import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("txt.txt");
        Song song = new Song("кечки бишкек", "мирбек атабеков", "Кечки Бишкек - мен көргөн тагдырга болдуң себеп");
        fileWriter.write("кечки бишкек" +
                "\nмирбек атабеков" +
                "\nКечки Бишкек - мен көргөн тагдырга болдуң себеп");


        fileWriter.close();


        try {

            FileReader fileReader = new FileReader("txt.txt");

            System.out.println(song);


            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());


        }
    }
}
