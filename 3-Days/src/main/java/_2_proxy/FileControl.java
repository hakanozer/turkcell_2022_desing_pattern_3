package _2_proxy;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileControl {

    public boolean control(String path) {
        boolean status = true;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            FileChannel fileChannel = fileInputStream.getChannel();
            long size = fileChannel.size();
            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            CharBuffer charBuffer = StandardCharsets.ISO_8859_1.decode(byteBuffer);

            Scanner scanner = new Scanner(charBuffer.toString());
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                if ( line.contains("<?php") ) {
                    status = false;
                    break;
                }
                System.out.println(line);
            }
            fileChannel.close();
            fileInputStream.close();
        }catch (Exception ex) {
            System.err.println("File error : " + ex );
        }

        return status;
    }

}
