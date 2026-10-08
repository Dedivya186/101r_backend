package com.IoStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\Santhosh\\OneDrive\\Desktop\\File\\abc.txt";
		File file=new File(location);
		FileOutputStream w=new FileOutputStream(file);
		String h="hello this is java class";
		byte bytes[]=h.getBytes();
		if(file.exists()) {
			w.write(bytes);
		}
		else {
			file.createNewFile();
			w.write(bytes);
			
		}

	}

}
