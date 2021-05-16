package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("abc.text");
			String msg = "Welcome to java";
			byte byteArray[]= msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("message written to file successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
