/**
 * 
 */
package com.sc;

import com.sc.sort.BubbleSort;
import com.sc.sort.QuickSort;

public class BinarySearchApp {

	BinarySearchImpl bubbleSortBasedSearchImpl	=	null;
	BinarySearchImpl quickSortBasedSearchImpl	=	null;
	public BinarySearchApp() {
		bubbleSortBasedSearchImpl	=	new BinarySearchImpl();
		bubbleSortBasedSearchImpl.setSi(new BubbleSort());
		
		quickSortBasedSearchImpl	=	new BinarySearchImpl();
		quickSortBasedSearchImpl.setSi(new QuickSort());
	}
	public static void main(String[] args) {
		BinarySearchApp search	=	new BinarySearchApp();
		search.search();
	}
	
	public void search() {
		int sourceNumbers [] 	= 	{1,2,3,4,5,6,7,8,9,10};
		performBubbleSort(sourceNumbers);
		performQuickSort(sourceNumbers);
	}

	private void performQuickSort(int[] sourceNumbers) {
		boolean isPresent =	quickSortBasedSearchImpl.isPresent(sourceNumbers);
		System.out.println("Completed QuickSort "+isPresent);
	}


	private void performBubbleSort(int[] sourceNumbers) {
		boolean isPresent =	bubbleSortBasedSearchImpl.isPresent(sourceNumbers);
		System.out.println("Completed BubbleSort "+isPresent);
	}

}
