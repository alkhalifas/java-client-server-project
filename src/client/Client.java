// File: src/client/Client.java
package client;


import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to server.");

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        // Send a byte
        out.write(42);

        // Read the response
        int response = in.read();
        System.out.println("Response: " + response);

        socket.close();
        System.out.println("Disconnected from server.");
    }
}
