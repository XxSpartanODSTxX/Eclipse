package com.program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		while (true) {
			Socket socket = new Socket("localhost", 5555);
			System.out.println("Write message");
			Scanner scanner = new Scanner(System.in);
			DataOutputStream cdout = new DataOutputStream(socket.getOutputStream());
			String sendData = scanner.nextLine();
			cdout.writeUTF(sendData);

			DataInputStream cdIn = new DataInputStream(socket.getInputStream());
			System.out.println(cdIn.readUTF());

			socket.close();
		}
	}
}
