package com;

public class QuickSort {
	public void Sort(String arr[], int begin, int end) {
		if(begin<end) {
			int partitionIndex = partition(arr,begin,end);
			Sort(arr,begin,partitionIndex-1);
			Sort(arr,partitionIndex+1,end);			
		}
	}
	
	private int partition(String arr[], int begin, int end) {
		String pivot = arr[end];
		int i = (begin-1);
		
		for(int j=begin;j<end;j++ ) {
			int result = arr[j].compareTo(pivot);
			
			if(result <= 0) {
				i++;
				String swapTemp = arr[i];
				arr[i]=arr[j];
				arr[j]=swapTemp;
			}
		}
		String swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;
		return i+1;
	}
	

}
