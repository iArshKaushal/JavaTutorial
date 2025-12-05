package org.akk.oop2_advance.q_java_io.a_io_streams.character_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex5OutputStreamWriter {
    public static void main(String[] args) {

        try {
            // Step-1: Connect to byte output stream (file)
            // FileOutputStream is a byte stream It opens a file named ex5.txt in writing mode, It asks the Operating System to create or open a file
            FileOutputStream fos = new FileOutputStream(ROOT_FILE_PATH + "ex5.txt");

            // Step-2: Use OutputStreamWriter to convert chars → bytes
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            // Step-3: Write characters
            if(fos!=null){
                osw.write("Hallo,\nGuten Morgen,\nIch bin Ashwani Kumar.\nIch komme aus Indien.\nIch arbeite als Softwareentwickler.");

                osw.flush();  // forces write to file but stream open
                osw.write("\nWorking Fine"); // The Stream remains usable after a flush.

                osw.close();
                //osw.write("\n This line throw exception"); // Throw exception

                fos.close(); // Flushes automatically (if needed)
                System.out.println("Data written to ex5.txt successfully!");
            }else {
                System.out.println("Data written to ex5.txt failed!");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
