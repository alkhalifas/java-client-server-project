// File: src/server/Server.java

// Declares that this class belongs to server package
package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started. Waiting for clients...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();

            // Simple protocol: Read a byte, write it back
            int data = in.read();
            out.write(data);

            clientSocket.close();
            System.out.println("Client disconnected.");
        }
    }
}
