import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try {
            // get a reference to the registry on the server's host
            Registry registry = LocateRegistry.getRegistry("localhost", 12345);

            // lookup the remote object from the registry
            Hello stub = (Hello) registry.lookup("Hello");

            // call the remote method
            String response = stub.sayHello("World");

            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            System.err.println("HelloClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
