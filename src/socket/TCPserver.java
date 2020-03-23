package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            ServerSocket serverSocket = new ServerSocket(6500);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println(socket.getPort()+"."+socket.getLocalAddress());
                OutputStream outputStream = socket.getOutputStream();
                InputStream inputStream = socket.getInputStream();
                int ch = 0;
                byte[] buff = new byte[1024];
                ch = inputStream.read(buff);
                String string = new String(buff,0,ch);
                System.out.println(string);
                outputStream.write((string+"消息回发").getBytes());
                outputStream.close();
                inputStream.close();
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new TCPserver();
        thread.start();
    }
}
