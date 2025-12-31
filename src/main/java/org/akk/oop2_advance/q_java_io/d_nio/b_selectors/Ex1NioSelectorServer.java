package org.akk.oop2_advance.q_java_io.d_nio.b_selectors;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

class Ex1NioSelectorServer {


    public static void main(String[] args) throws IOException {

        // 1️⃣ Create selector
        Selector selector = Selector.open();

        // 2️⃣ Create server channel
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(5000));
        serverChannel.configureBlocking(false);

        // 3️⃣ Register server channel with selector
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("Server started on port 5000...");

        while (true) {

            // 4️⃣ Block until at least one channel is ready
            selector.select();

            // 5️⃣ Get selected keys
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();

                // 6️⃣ Check events
                if (key.isAcceptable()) {
                    handleAccept(key, selector);
                }
                if (key.isReadable()) {
                    handleRead(key);
                }
            }
        }
    }

    private static void handleAccept(SelectionKey key, Selector selector) throws IOException {
        ServerSocketChannel server = (ServerSocketChannel) key.channel();
        SocketChannel client = server.accept();
        client.configureBlocking(false);

        client.register(selector, SelectionKey.OP_READ);
        System.out.println("Client connected: " + client);
    }

    private static void handleRead(SelectionKey key) throws IOException {
        SocketChannel client = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        int bytesRead = client.read(buffer);

        if (bytesRead == -1) {
            client.close();
            return;
        }

        buffer.flip();
        String message = new String(buffer.array(), 0, buffer.limit());
        System.out.println("Received: " + message);

        client.write(ByteBuffer.wrap(("Echo: " + message + ", this side").getBytes()));
    }
}
