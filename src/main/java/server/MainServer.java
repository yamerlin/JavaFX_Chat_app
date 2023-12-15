package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * start a server. Reads the server's port from the command line argument
 * @author Remi Watrigant
 *
 */
public class MainServer {
    /**
     * creates a new server
     * @param args
     */
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                printUsage();
            } else {
                Integer port =  Integer.valueOf(args[0]);
                Server server = new Server(port);

            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    private static void printUsage() {
        System.out.println("java server.Server <port>");
        System.out.println("\t<port>: server's port");
    }
}
