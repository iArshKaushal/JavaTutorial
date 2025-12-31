package org.akk.oop2_advance.q_java_io.d_nio.b_selectors;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Ex1NioClient {

    public static void main(String[] args) throws Exception {

        try {
            SocketChannel client = SocketChannel.open(new InetSocketAddress("localhost", 5000));

            // Client: sending data to the server
            client.write(ByteBuffer.wrap("Hello Server".getBytes()));

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            client.read(buffer);

            buffer.flip();
            System.out.println(new String(buffer.array(), 0, buffer.limit()));

            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
