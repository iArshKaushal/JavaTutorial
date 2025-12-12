package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.filter_input_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.DESKTOP_FILE_DIR;

public class Ex3BufferedInputStream {
    public static void main(String[] args) {
        long startTime, endTime;

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/Users/iarsh/Downloads/100MB.bin"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DESKTOP_FILE_DIR));
        ) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            startTime = System.currentTimeMillis();
            System.out.println("Coping started...Please Wait...");

            if (bis.available() > 0 && bis != null) {
                while ((bytesRead = bis.read(buffer)) != -1) {
                    System.out.println("Read " + bytesRead + " bytes & moving to the internal buffer");
                    bos.write(buffer, 0, bytesRead);
                }
                bos.flush();
                System.out.println("Fast copy done!");

                endTime = System.currentTimeMillis();
                System.out.println("Time taken: " + (endTime - startTime) + "ms");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
