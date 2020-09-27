package com.io;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) {
		File file = new File("sample1.txt");
		String content = "This is the text content jkdhjdadnmJK KJBDSADSABKDA BD\n JAVA\t Class";
		
		try (OutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);) {
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// get the content in bytes
			bout.write(content.getBytes());
			
			System.out.println("file Write DONE");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
