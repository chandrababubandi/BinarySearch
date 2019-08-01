package com.sc;

import com.sc.interfaces.SortInterface;

public class BinarySearchImpl {
	
	 SortInterface si	=	null;
	 
	public SortInterface getSi() {
		return si;
	}
	public void setSi(SortInterface si) {
		this.si = si;
	}
	boolean isPresent(int[] sourceNumbers) {
		si.sort(sourceNumbers);
		System.out.println("BinarySearchSymbol:searchSymbol() Binary Searching ");
		return true;
	}

	
}
