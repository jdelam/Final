package testSelectionSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SelectionSort.SelectionSort;

class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}
	
	public testSelectionSort() {}
	
	//test rundown
	public void testPositive(){
		//Given
		SelectionSort selectionSort = new SelectionSort();		//Add new function from main class
		int[] arr = new int[5];		//Add initial array
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];		//Add sorted array
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
	    //When
		for (int i = 0; i < arr.length; i++) {
			int[] testData = arr;
			int[] expectedSortedArr = Sortedarr;
			 
			int[] arrSelectionSort = testData.clone();
			
			selectionSort.selectionSort(arrSelectionSort);
			
			//Then
            assertArrayEquals(expectedSortedArr, arrSelectionSort);
		}
	}
	
	public void testNegative(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		//When
		for (int i = 0; i < arr.length; i++) {
			int[] testData = arr;
			int[] expectedSortedArr = Sortedarr;
			 
			int[] arrSelectionSort = testData.clone();
			
			selectionSort.selectionSort(arrSelectionSort);
			
			//Then
            assertArrayEquals(expectedSortedArr, arrSelectionSort);
		}
	}
	
	public void testMixed(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 0;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -8;
		Sortedarr[2] = 0;
		Sortedarr[3] = 7;
		Sortedarr[4] = 9;
		//When
		for (int i = 0; i < arr.length; i++) {
			int[] testData = arr;
			int[] expectedSortedArr = Sortedarr;
			 
			int[] arrSelectionSort = testData.clone();
			
			selectionSort.selectionSort(arrSelectionSort);
			
			//Then
            assertArrayEquals(expectedSortedArr, arrSelectionSort);
		}
	}
	

}
