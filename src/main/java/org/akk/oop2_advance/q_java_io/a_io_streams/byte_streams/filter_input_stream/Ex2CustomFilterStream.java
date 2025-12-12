package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.filter_input_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex2CustomFilterStream {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream(ROOT_FILE_PATH + "filterstream.txt");

            // Wrap it inside your custom filter
            LowerCaseInputStream lcis = new LowerCaseInputStream(in);

            /// Example 1 - Single Byte Read
            /// System.out.println("OUTPUT - Example 1 - Single Byte Read");
           /* int data;
            while((data = lcis.read()) != -1){
                System.out.print((char)data);
            }
            */

            /// Example 2 - Bulk Byte Read
            System.out.println("OUTPUT - Example 2 - Bulk Byte Read");
            int bytesRead;
            byte[] buffer = new byte[1024];
            while((bytesRead = lcis.read(buffer, 0, buffer.length)) != -1){
                // Create a String from read bytes
                String str = new String(buffer, 0, bytesRead);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void singleByteRead(){}

    public static void bulkRead(){

    }
}

class LowerCaseInputStream extends FilterInputStream {

    // Constructor must call super(in)
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }
/*
    @Override
    public int read() throws IOException {
        int data = super.read();         // Read 1 byte from wrapped stream

        if (data == -1) return -1;       // End of stream

        return Character.toLowerCase((char) data);  // Convert to lowercase
    }*/

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        if (result == -1) return -1;

        // Convert each byte to lowercase
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }


}


