package javaassignments;

import java.util.Arrays;

public class FindMaxandMininArray {

	public static void main(String[] args) {
		int original[] = { 10, 20, 40, 70, 80 };
		int ele = 20;
		int newArray[] = removeElement(original, ele);
		System.out.println(Arrays.toString(newArray));

//		int max = a[0];
//
//		for (int i = 1; i < a.length; i++) {
//
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
//		System.out.println(max);
//
//		int min=a[0];
//		for (int i=1;i<a.length;i++) {
//			if(a[i]<min) {
//				min=a[i];
//			}
//		}
//		System.out.println(min);

	}

	public static int[] removeElement(int array[], int element) {

		int[] updArray = new int[array.length - 1];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != element) {

				updArray[index] = array[i];
				index++;

			}
		}
		return updArray;
	}

}
