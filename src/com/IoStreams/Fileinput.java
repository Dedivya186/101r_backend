package com.IoStreams;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileinput {

	public static void main(String[] args) throws IOException {
		String location1="C:\\Users\\Santhosh\\OneDrive\\Desktop\\File\\abc.txt";
		
        FileInputStream fis=new FileInputStream(location1);
//        System.out.println(fis.read());
//        System.out.println((char)(fis.read()));
        int i;
        while((i=fis.read())!=-1) {
        	System.out.print((char)i);
        }
//        System.out.println("file read");
	}

}
