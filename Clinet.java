package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Clinet {
    public static void main(String[] args) {
        try {
            Registry re = LocateRegistry.getRegistry(3000);
            RemoteInterface add = (RemoteInterface) re.lookup("Add");
             int s = add.add(2,3);
             System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
