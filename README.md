# Client Server TCP vs UDP Tutorial

### Abstract:
The following repo comprises a tutorial of several types of transfer protocols (TCP, UDP). TCP (Transmission Control Protocol) is a connection-oriented protocol, meaning that a connection is established and maintained until the application programs at each end have finished exchanging messages. UDP (User Datagram Protocol) is a connectionless protocol. Datagrams (packets) are sent across the network without establishing a connection.


### Quick Start TCP:

Start Server:

    javac src/server/TCPServer.java
    java TCPServer

Start Client:

    javac src/client/TCPClient.java
    java TCPClient

### Quick Start UDP:

Start Server:

    javac src/server/UDPServer.java
    java UDPServer

Start Client:

    javac src/client/UDPClient.java
    java UDPClient