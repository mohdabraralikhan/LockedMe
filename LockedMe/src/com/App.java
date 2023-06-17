package com;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	App() {
		DevInfo info = new DevInfo();

		info.displayInfo();

	}

	public static void main(String args[]) throws IOException {

		int option,subOption;
		String file;
		
		
		@SuppressWarnings("unused")
		App app = new App();
		Options options = new Options();

		System.out.println("Enter a the folder");
		Scanner scanner = new Scanner(System.in);
		try {
			String path = scanner.nextLine();

			while (true) {
				options.displayOptions();
				System.out.println("Select an Option");
				option = scanner.nextInt();
				scanner.nextLine();

				switch (option) {
				case 1:
					options.displayFileNames(path);
					break;

				case 2:
					
					
					loop:while(true){
						System.out.println("Select a sub-catogery");
						subOption = scanner.nextInt();
						scanner.nextLine();

					switch (subOption) {

					case 1:
						System.out.println("Enter a file name to add:\n");
						file = scanner.nextLine();
						options.addFile(path, file);
						break;

					case 2:
						System.out.println("Enter a file name to delete");
						
						if(scanner.hasNextLine()) {
							file = scanner.nextLine();
							options.deleteFile(path, file);
						}
						break;

					case 3:
						System.out.println("Enter a file name to search:\n");
						file = scanner.nextLine();
						options.searchFile(path, file);
						break;
					case 4:
						 System.out.println("Closed sub-menu");
			                break loop;
			                
			            default:
			                System.out.println("Please select a valid sub-category");
						break;
					}}break;
				case 3:
					options.closeApplication();
					System.out.println("Application Terminated");
					break;
				default:
					System.out.println("Please select a valid option");

				}

			}
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid option number.");
            scanner.nextLine();

		}
		scanner.close();
	}}
