package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPclient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6500);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        os.write(("TCP").getBytes());
        int ch = 0;
        byte[] buff = new byte[1024];

        ch = is.read(buff);
        System.out.println(new String(buff));
        os.close();
        is.close();
        socket.close();
    }
}
