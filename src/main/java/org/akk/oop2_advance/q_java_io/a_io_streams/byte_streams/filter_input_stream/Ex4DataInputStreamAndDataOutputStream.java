package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.filter_input_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex4DataInputStreamAndDataOutputStream {

    public static void main(String[] args) {
        try {
            /// Writing
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(ROOT_FILE_PATH + "data.bin"));
            dos.writeInt(9);
            dos.writeUTF("Ashwani Kumar");
            dos.writeChar('A');
            dos.writeDouble(11.11);
            dos.close();

            /// Reading
            DataInputStream dis = new DataInputStream(new FileInputStream(ROOT_FILE_PATH + "data.bin"));
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            dis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
