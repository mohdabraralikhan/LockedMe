package com;

public class BinarySearch {
	 public void Search(String arr[],int begin,int end, String fileName) {
		 int mid = (begin+end)/2;
		
		 while(begin<=end) {
			 int res = arr[mid].compareToIgnoreCase(fileName);
			 if(res<0) {
				 begin = mid+1;
			 }
			 else if(res == 0) {
				 System.out.println("File found " + fileName); 
				 break;
			 }
			 else {
				 end = mid-1;
			 }
			 mid = (begin+end)/2;
		 }
			
		 if(begin>end) {
			 System.out.println("File not found");
		 }
	 }
}