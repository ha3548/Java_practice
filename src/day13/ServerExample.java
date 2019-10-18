package day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.30.55", 5001));

			while (true) {
				// Client.connect()
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("Server : accpet()" + isa.getHostName());

				byte[] bytes = null;
				String message = null;

				// 수신
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readSize = is.read(bytes);
				message = new String(bytes, 0, readSize, "UTF-8");

				// 송신
				OutputStream os = socket.getOutputStream();
				message = "Hi Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				System.out.println("서버 송신 완료");

				is.close();
				os.close();
				socket.close();
			}

		} catch (Exception e) {
		}
		try {
			serverSocket.close();
		} catch (IOException e1) {
		}
	}

}