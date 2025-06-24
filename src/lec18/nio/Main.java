package lec18.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void writeFile(String filename, String content) {
        Path filePath = Paths.get(filename);

        try(FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024); // 버퍼 준비

            // 버퍼에 데이터 쓰기
            buffer.put(content.getBytes());
            buffer.flip(); // 모드 전환
            writeChannel.write(buffer);
            System.out.println("파일을 성공적으로 작성 완료했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(filename);
    }

    public static void readFile(String filename) {
        Path filePath = Paths.get(filename);

        try(FileChannel readChannel = FileChannel.open(filePath, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int byteRead = readChannel.read(buffer);

            while(byteRead != -1) {
                buffer.flip(); // 쓰기 모드에서 읽기 모드로 전환

                String chunck = StandardCharsets.UTF_8.decode(buffer).toString();
                System.out.println(chunck);

                buffer.clear();
                byteRead = readChannel.read(buffer);
            }
            System.out.println("\n파일 읽기가 완료 되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        writeFile("dinner-menu.txt", "오늘의 저녁 메뉴는?");
        readFile("dinner-menu.txt");
    }
}
