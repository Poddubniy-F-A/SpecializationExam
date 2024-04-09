package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main1 {
    public static void main(String[] args) {
        try {
            int wordsCount = 0;

            for (String line : Files.readAllLines(Path.of("input.txt"))) {
                wordsCount += line.split(" ").length;
            }

            System.out.println("Число слов: " + wordsCount);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла input.txt");
        }
    }
}
