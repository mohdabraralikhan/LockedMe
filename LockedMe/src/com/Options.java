package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Options {
	
	public void displayOptions() {

		System.out.println("---------------------------------------" + "\n1.List all the files in the directory." + "\n2.Perform file operations\n"
				+ "\t1.Add a file\t" + "\t2.Delete a file" + " \t 3.Search a file" + "\n3.Close the application\n"+"---------------------------------------");
	}

	public void displayFileNames(String path) {

		File folder = new File(path);
		if (folder.isDirectory()) {

			List<String> files = Arrays.asList(folder.list());

			Collections.sort(files, String.CASE_INSENSITIVE_ORDER);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");

			for (String file : files) {
				System.out.println(file);
			}
			System.out.println("---------------------------------------");

		} else {
			System.out.println(folder.getAbsolutePath() + " is not a directory");
		}
	}



	
}
}