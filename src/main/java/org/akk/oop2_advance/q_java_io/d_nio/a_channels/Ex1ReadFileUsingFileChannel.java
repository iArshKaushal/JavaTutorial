package org.akk.oop2_advance.q_java_io.d_nio.a_channels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex1ReadFileUsingFileChannel {
    public static void main(String[] args) {

        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(ROOT_FILE_PATH + "demo1.txt", "r");

            FileChannel channel = raf.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024); // Creating Buffer

            while (channel.read(buffer) > 0) {
                buffer.flip();  // Prepare buffer for read by app
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());  // App reads data
                }
                buffer.clear(); // Prepare for next read
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                raf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
