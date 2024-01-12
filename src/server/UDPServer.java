import java.io.*;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        int port = 1234;
        DatagramSocket datagramSocket = new DatagramSocket(port);
        byte[] receiveBuffer = new byte[1024];

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            datagramSocket.receive(receivePacket);

            String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from client: " + receivedData);

            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(receiveBuffer, receiveBuffer.length, clientAddress, clientPort);
            datagramSocket.send(sendPacket);
        }
    }
}
