package com;

import java.io.File;
import java.io.IOException;


public class Options {
	
QuickSort Quick = new QuickSort();
	public void displayOptions() {

		System.out.println("---------------------------------------" + "\n1.List all the files in the directory."
				+ "\n2.Perform file operations\n" + "\t1.Add a file\t" + "\t2.Delete a file" + " \t 3.Search a file"
				+ "\n3.Close the application\n" + "---------------------------------------");
	}

	public void displayFileNames(String path) {

		File folder = new File(path);
		if (folder.isDirectory()) {

			String[] files = folder.list();
			System.out.println("Size of the array" + files.length);
			Quick.Sort(files,0, files.length-1);

			//Collections.sort(files, String.CASE_INSENSITIVE_ORDER);
			
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

	public void deleteFile(String path, String filename) {

		File file = new File(path + "\\\\" + filename);
		if (file.delete()) {
		}
		System.out.println("Deleted file scuccessfully!");

	}

	public void searchFile(String path, String file) {
		boolean found = false;
		File folder = new File(path);
		String[] files = folder.list();
		for (int i = 0; i < files.length; i++) {
			if (file.equals(files[i])) {
				System.out.println("File found " + file);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("File not found " + file);
		}
	}

	public void closeApplication() {
		System.out.println("---------------------------------------" + "Application closed" + "---------------------------------------");
		System.exit(0);
	}

	public void addFile(String path, String file) throws IOException {
		try {
			File newFile = new File(path + "\\" + file);
			if ((newFile.createNewFile())) {
				System.out.println("File created: " + newFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}