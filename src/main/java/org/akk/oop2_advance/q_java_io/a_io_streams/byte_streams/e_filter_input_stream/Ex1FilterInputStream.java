package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.e_filter_input_stream;

import java.io.*;


/** FilterInputStream:
 * ====================
 * Java FilterInputStream class implements the InputStream.
 * It contains different subclasses as BufferedInputStream, DataInputStream for providing additional functionality.
 * So it is less used individually.
 * */

public class Ex1FilterInputStream {
    public static void main(String[] args) throws IOException {

        File data = new File("D:/testout.txt");
        FileInputStream  file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}
