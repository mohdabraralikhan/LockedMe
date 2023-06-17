package com;

import java.io.File;
import java.io.IOException;


public class Options {

	public void displayOptions() {

		System.out.println("---------------------------------------" + "\n1.List all the files in the directory."
				+ "\n2.Perform file operations\n" + "\t1.Add a file\t" + "\t2.Delete a file" + " \t 3.Search a file"+" \t 3.Main menu"
				+ "\n3.Close the application\n" + "---------------------------------------");
	}


	public void displayFileNames(String path) {
	    File folder = new File(path);

	    if (folder.isDirectory()) {
	        String[] files = folder.list();

	        QuickSort quickSort = new QuickSort();
	        quickSort.Sort(files, 0, files.length - 1);

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

		String filePath= path + File.separator + filename;
		File file = new File(filePath);
		if(file.exists()) {
		if (file.delete()) {
			System.out.println("Deleted file scuccessfully!");

		} else {
            System.out.println("Failed to delete the file.");
        }
		}else {System.out.println("File not found");}
		}
		

	

	public void searchFile(String path, String file) {
		File folder = new File(path);
		BinarySearch Binary = new BinarySearch();
		String[] files = folder.list();
		Binary.Search(files,0, files.length, file);
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