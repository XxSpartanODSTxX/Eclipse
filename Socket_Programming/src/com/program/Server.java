package com.program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(5555);
		Socket socket = serverSocket.accept();

		DataInputStream cdIn = new DataInputStream(socket.getInputStream());
		System.out.println(cdIn.readUTF());

		DataOutputStream cdout = new DataOutputStream(socket.getOutputStream());
		cdout.writeUTF("Second Commit");

		serverSocket.close();
	}
}
