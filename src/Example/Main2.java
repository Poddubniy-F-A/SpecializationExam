package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main2 {
    public static void main(String[] args) {
        try {
            String longestWord = null;

            for (String line : Files.readAllLines(Path.of("input.txt"))) {
                for (String word : line.split(" ")) {
                    if (longestWord == null || word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            if (longestWord != null) {
                System.out.println("Самое длинное слово (или одно из): " + longestWord);
            } else {
                System.out.println("Файл пуст");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла input.txt");
        }
    }
}
