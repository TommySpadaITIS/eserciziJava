import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class spadaTommasoTabellinaPitagoricaFile {
    final static String FILE_NAME = "pitagorica.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        int prod;
        try (PrintStream ps = new PrintStream(file)) {
            System.out.println("\nfile trovato");
            for (int i = 1; i <= 10; i++) {
                for (int c = 1; c <= 10; c++) {
                    prod = i * c;
                    ps.print("|\t" + prod + "\t");
                }
                ps.print("|");
                ps.println();

            }
            System.out.print("\nstampa su file eseguita correttamente\n");
            System.out.println();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        for (int i = 1; i <= 10; i++) {
            for (int c = 1; c <= 10; c++) {
                prod = i * c;
                System.out.print("|\t" + prod + "\t");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}