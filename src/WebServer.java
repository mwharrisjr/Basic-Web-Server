package src;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer Object.
 *
 * WebServer represents a server that serves up web content through its
 * ServerSocket. Listens indefinitely for new client connections and creates
 * a new thread to handle client requests.
 *
 * @author Maurice Harris 1000882916
 *
 */
public class WebServer {

    /**
     * Creates the ServerSocket and listens for client connections, creates a
     * separate thread to handle each client request.
     *
     * @param args an array of arguments to be used in the
     *
     *
     */
    public static void main(String[] args) throws Exception {

        // Create ServerSocket on LocalHost, port 6789
        ServerSocket serverSocket = new ServerSocket(6789);
        System.out.println("Listening for connections on port 6789...\r\n");

        // Listen for new client connections
        while(true) {

            // Accept new client connection
            Socket connectionSocket = serverSocket.accept();

            // Create new thread to handle client request
            Thread connectionThread = new Thread(new Connection(connectionSocket));

            // Start the connection thread
            connectionThread.start();
            System.out.println("New connection on port 6789...\r\n");
        }
    }
}
