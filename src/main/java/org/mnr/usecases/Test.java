package org.mnr.usecases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "G", "D", "F"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F"));

         list2.removeAll(list1);

//         System.out.println(list1);
         System.out.println(list2);  

	}

}
