import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // You can use print statements as follows for debugging, they'll be visible when running tests.
        System.out.println("Logs from your program will appear here!");
        String path ="";
        if(args.length>0){
            path = args[1];
            System.out.println(path);
        }

        try {

            HttpServer server = new HttpServer(4221,path);
            server.run();


        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
