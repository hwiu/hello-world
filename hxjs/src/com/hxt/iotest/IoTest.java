package com.hxt.iotest;

import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) throws IOException{
		if(args.length>0){
			String hostString = args[0];
			InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
			for(InetAddress a: addresses)
				System.out.println(a);
		}

	}
}
class SocketTest{
	public SocketTest(){
		Socket s = new Socket();
		try {
			s.connect(new InetSocketAddress("localhost", 8080), 1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
