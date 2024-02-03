package arrayRelatedProgram;

import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer;

public class SortingElement {

	public static void main(String[] args) {
		
		int a[]= {30,50,10,40,70};
		
		System.out.println("Array element before sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array element after sorting: "+Arrays.toString(a));
		
		//approach2
		System.out.println();
		System.out.println("Approach 2");
		int b[]= {30,50,10,40,70};
		System.out.println("Array element before sorting: "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array element after sorting: "+Arrays.toString(b));
		
		//approach3
		System.out.println();
		System.out.println("Approach 3");
		Integer c[]= {30,50,10,40,70};
		System.out.println("Array element before sorting: "+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("Array element after sorting: "+Arrays.toString(c));

		
	}

}
