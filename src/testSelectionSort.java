import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort  {
	
	@Test
	public void test() {
		
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		
	}
public testSelectionSort() {
	
}


public void testPositive(){
	
	SelectionSort sort = new SelectionSort ();
	
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = 9;
	arr[2] = 7;
	arr[3] = 10;
	arr[4] = 2;
	
	int[] Sortedarr = new int[5];
	Sortedarr[0] = 2;
	Sortedarr[1] = 7;
	Sortedarr[2] = 8;
	Sortedarr[3] = 9;
	Sortedarr[4] = 10;
	
	sort.basicSelectionSort(arr);
	assertArrayEquals(arr ,Sortedarr);
	
	/** add tests to check for this unit test **/
}


public void testNegative(){
/** Test data contains negative values only **/
	SelectionSort sort = new SelectionSort ();
	
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = -3;
	arr[2] = -4;
	arr[3] = -1;
	arr[4] = -9;
	
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -9;
	Sortedarr[1] = -8;
	Sortedarr[2] = -4;
	Sortedarr[3] = -3;
	Sortedarr[4] = -1;
	
	sort.basicSelectionSort(arr);
	assertArrayEquals(arr ,Sortedarr);
}


public void testMixed(){
/** Test data contains with both positive, negative and zeros **/

	SelectionSort sort = new SelectionSort ();
	
	int[] arr = new int[5];
	arr[0] = -3;
	arr[1] = -8;
	arr[2] = 1;
	arr[3] = 0;
	arr[4] = 5;
	
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -8;
	Sortedarr[1] = -3;
	Sortedarr[2] = 0;
	Sortedarr[3] = 1;
	Sortedarr[4] = 5;
	
	sort.basicSelectionSort(arr);
	assertArrayEquals(arr ,Sortedarr);
	
}


public void testDuplicates(){
/** Test data contains duplicates **/
	SelectionSort sort = new SelectionSort ();
	
	int[] arr = new int[5];
	arr[0] = 8;
	arr[1] = 8;
	arr[2] = 8;
	arr[3] = 8;
	arr[4] = 8;
	
	int[] Sortedarr = new int[5];
	Sortedarr[0] = 8;
	Sortedarr[1] = 8;
	Sortedarr[2] = 8;
	Sortedarr[3] = 8;
	Sortedarr[4] = 8;
	
	sort.basicSelectionSort(arr);
	assertArrayEquals(arr ,Sortedarr);
	
}

}
