package com.demo.test;

import java.util.Scanner;
import java.util.stream.Stream;

public class TestBinarySearch {

	public static void main(String[] args) {
		//int[] arr=new int[10];
		//acceptData(arr)
		Scanner sc=new Scanner(System.in);
		Integer[] arr= {2,4,5,12,15,16,17,34,45,67};
		Stream.of(arr).forEach(System.out::println);
		String ans=null;
		do {
		System.out.println("enetr number for search");
		int snum=sc.nextInt();
		int pos=binarySearch(arr,0,arr.length-1,snum);
		if(pos!=-1) {
			System.out.println("number found at : "+pos);
		}else {
			System.out.println("number not found");
		}
		System.out.println("do you want to continue(y/n)?");
		ans=sc.next();
		}while(ans.equals("y"));
		

	}

	private static int binarySearch(Integer[] arr, int low, int high, int num) {
		int l=low;
		int h=high;
		if(l<=h) {
			int mid=(l+h)/2;
			System.out.println("low: "+low+" high : "+high+" mid: "+mid);
			//check whether the number is at mid position
			if(arr[mid]==num) {
				//number found
				return mid;
			}else if(num<arr[mid]) {
				return binarySearch(arr, l, mid-1, num);
			}else {
				return binarySearch(arr, mid+1, h, num);
			}
		}
		//number not found
		return -1;
	}

}
