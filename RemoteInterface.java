

package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface RemoteInterface extends Remote {
public int add(int x, int y) throws RemoteException;
     
}