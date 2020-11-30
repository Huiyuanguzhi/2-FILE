package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// FileOutputStream(File file)
		// File file = new File("fos.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// FileOutputStream(String name)
		FileOutputStream fos = new FileOutputStream("fos.txt");

		fos.write("hello,IO".getBytes());
		fos.write("java".getBytes());

		fos.close();
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());
	}
}
