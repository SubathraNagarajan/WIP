package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Brown");
		int size = list.size();
		System.out.println("Size of the List is "+ size);
	Collections.reverse(list);
	System.out.println(list);
		
/*		for (int i=size-1; i>=0; i--) {
			String string2 = list.get(i);
			System.out.println(string2);}*/
	
	}

}
