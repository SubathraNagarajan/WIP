package week2.day2;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		Collections.addAll(set,"Red","Green","Blue","Yellow","Brown");
		List<String> list = new ArrayList<String>(set);
//		System.out.print(set);
		Collections.reverse(list);
		System.out.print(list);
		
		
	}

}
