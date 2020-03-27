package org.xjl.algorithm;

import java.util.Arrays;

public class maopao {

	public static void main(String[] args) {
		int[] arr = {1,9,0,12,2};
		
		//打擂台
		System.out.println("原数组"+Arrays.toString(arr));
		for(int i = 0; i< arr.length ;i++) {
		
			for(int j = 0 ; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("冒泡后数组"+Arrays.toString(arr));
		
	}

}
