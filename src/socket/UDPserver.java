package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPserver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6500);
        byte[] buff = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buff,buff.length);

        socket.receive(packet);
        byte[] data = packet.getData();
        System.out.println(new String(data,0,data.length));

        String string = "报文回发";
        DatagramPacket client = new DatagramPacket(string.getBytes(),string.getBytes().length,packet.getAddress(),packet.getPort());
        socket.send(client);
    }
}
