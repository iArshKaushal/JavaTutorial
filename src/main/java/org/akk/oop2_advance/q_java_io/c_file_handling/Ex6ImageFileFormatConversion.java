package org.akk.oop2_advance.q_java_io.c_file_handling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


/// Image Format Conversion in Java
/// (JPG to PNG/BMP/GIF Files)
public class Ex6ImageFileFormatConversion {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://m.media-amazon.com/images/I/610NQUzk2xL._SL1500_.jpg");

            BufferedImage bufferedImage = ImageIO.read(url);
            ImageIO.write(bufferedImage, "jpg", new File(ROOT_FILE_PATH +  "myimage.jpg"));
            ImageIO.write(bufferedImage, "png", new File(ROOT_FILE_PATH + "myimage.png"));
            ImageIO.write(bufferedImage, "bmp", new File(ROOT_FILE_PATH + "myimage.bmp"));
            ImageIO.write(bufferedImage, "gif", new File(ROOT_FILE_PATH + "myimage.gif"));

            System.out.println("Image converted successfully");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
