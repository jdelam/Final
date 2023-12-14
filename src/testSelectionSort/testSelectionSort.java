package testSelectionSort;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

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
		selectionSort.selectionSort(arr); 		// function.functionsortmethod(initial array)
	        
		//Then
		assertArrayEquals(Sortedarr, selectionSort.selectionSort(arr)); 	//assertArrayEquals(Sorted Array, when function)
		/** add tests to check for this unit test **/
	}
	
	public void testNegative(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = -8;
		testData[1] = -9;
		testData[2] = -7;
		testData[3] = -10;
		testData[4] = -2;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = -10;
		SortedTestData[1] = -9;
		SortedTestData[2] = -8;
		SortedTestData[3] = -7;
		SortedTestData[4] = -2;

        //When
		selectionSort.selectionSort(testData);
        
		//Then
		assertArrayEquals(SortedTestData, selectionSort.selectionSort(testData));
	}
	
	public void testMixed(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = -8;
		testData[1] = 9;
		testData[2] = 7;
		testData[3] = -10;
		testData[4] = 0;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = -10;
		SortedTestData[1] = -8;
		SortedTestData[2] = 0;
		SortedTestData[3] = 7;
		SortedTestData[4] = 9;
		
        //When
		selectionSort.selectionSort(testData);
        
		//Then
        assertArrayEquals(SortedTestData, selectionSort.selectionSort(testData));
	}

}
