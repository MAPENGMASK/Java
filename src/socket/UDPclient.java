package socket;

import java.io.IOException;
import java.net.*;

public class UDPclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] buff = "client".getBytes();

        DatagramPacket packet = new DatagramPacket(buff,buff.length,InetAddress.getByName("127.0.0.1"),6500);

        socket.send(packet);

        byte[] data = new byte[1024];
        DatagramPacket receive = new DatagramPacket(data,data.length);
        socket.receive(receive);
        System.out.println(new String(receive.getData(),0,receive.getLength()));
    }
}
