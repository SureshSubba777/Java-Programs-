import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket(4000);
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hey! Client";
        buf = s.getBytes();

        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);
        socket.close();
        
    }
}
