package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        try {
            HashMap<String, Integer> dict = new HashMap<>();

            for (String line : Files.readAllLines(Path.of("input.txt"))) {
                for (String word : line.split(" ")) {
                    if (!dict.containsKey(word)) {
                        dict.put(word, 1);
                    } else {
                        dict.put(word, dict.get(word) + 1);
                    }
                }
            }

            System.out.println("Частота встречаемости слов:");
            for (String key : dict.keySet()) {
                System.out.println(key + ": " + dict.get(key));
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла input.txt");
        }
    }
}
