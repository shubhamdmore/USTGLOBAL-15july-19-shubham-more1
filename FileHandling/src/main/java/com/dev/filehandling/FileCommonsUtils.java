package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtils {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/Text.txt");

		FileUtils.touch(file);
		
		if(file.exists())
		{
			System.out.println("file is there");
		}
		else
		{
			System.out.println("file not found");
		}
    	FileUtils.deleteQuietly(file);
    	if(file.exists())
		{
			System.out.println("file is there");
		}
		else
		{
			System.out.println("file not found");
		}
		
	}

}
