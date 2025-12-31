package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.e_filter_input_stream;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * Java PushbackInputStream
 * class overrides InputStream and provides extra functionality to another input stream.
 * It can unread a byte which is already read and push back one byte.
 * */
public class Ex6PushBackInputStream {

    public static void main(String[] args)throws Exception{
        String srg = "1##2#34###12";
        byte ary[] = srg.getBytes();
        ByteArrayInputStream array = new ByteArrayInputStream(ary);
        PushbackInputStream push = new PushbackInputStream(array);

        /// Method 1 - available()
        // It is used to return the number of bytes that can be read from the input stream.
        System.out.println(push.available());


        /// Method 2 - read() and unread()
        // read() --> It is used to read the next byte of data from the input stream.
        // unread() --> It is used to pushes back the byte by copying it to the pushback buffer.
        int i;
        while( (i = push.read())!= -1) {
            if(i == '#') {
                int j;
                if( (j = push.read()) == '#'){
                    System.out.print("**");
                }else {
                    push.unread(j);
                    System.out.print((char)i);
                }
            }else {
                System.out.print((char)i);
            }
        }


        /// Method 3-
        // It is used to pushes back the byte by copying it to the pushback buffer.



    }
}
