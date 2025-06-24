package lec18.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void writeFile(String filename, String content) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(filename);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        writeFile("lunch-menu.txt", "점메추~");
//        System.out.println("파일 생성 완료");
        readFile("lunch-menu.txt");
    }
}
