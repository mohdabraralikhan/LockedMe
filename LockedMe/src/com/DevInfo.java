package com;

public class DevInfo {
	public String applicationName = "LockedMe.com";
	public String developerName = "Abrar";
	
	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}


	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	void displayInfo() {
		System.out.println("---------------------------------------");
		System.out.println(applicationName + "\n" + developerName);
		System.out.println("---------------------------------------");
	}
	

}
