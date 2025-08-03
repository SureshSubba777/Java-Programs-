package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements RemoteInterface{
    AdderRemote() throws RemoteException{
        super();
    }
    public int add (int x, int y){
        return x+y;
    }
    
}

