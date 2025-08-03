package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            AdderRemote ad = new AdderRemote();
            Registry ry = LocateRegistry.createRegistry(3000);
            ry.rebind("Add", ad);
            System.out.println("Server is ready");

        }
        catch(RemoteException e){
            e.printStackTrace();
        }
    }
}
