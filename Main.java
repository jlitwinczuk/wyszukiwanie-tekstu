import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szukany wzorzec: ");
        String pattern = scanner.nextLine();
        scanner.close();

        pattern = pattern.replace("*", ".*").replace("?", ".");

        File currentDirectory = new File(".");
        File[] txtFiles = currentDirectory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (txtFiles != null) {
            for (File txtFile : txtFiles) {
                searchPatternInFile(txtFile, pattern);
            }
        } else {
            System.out.println("Brak plików .txt w bieżącym katalogu.");
        }
    }

    private static void searchPatternInFile(File file, String pattern) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            Pattern regex = Pattern.compile(pattern);
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                Matcher matcher = regex.matcher(line);
                if (matcher.find()) {
                    System.out.printf("Plik: %s, Numer linii: %d, Znaleziony fragment: %s%n", file.getName(), lineNumber, line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}