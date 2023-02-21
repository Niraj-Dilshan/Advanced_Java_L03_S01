import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            // create a registry on the default RMI port
            Registry registry = LocateRegistry.createRegistry(12345);

            // create a new instance of the remote object and bind it in the registry
            HelloImpl obj = new HelloImpl();
            registry.rebind("Hello", obj);

            System.out.println("HelloServer bound in registry");
        } catch (Exception e) {
            System.err.println("HelloServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
