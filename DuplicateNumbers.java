package week2.day2;
import java.util.*;
public class DuplicateNumbers {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> duplicate = new LinkedHashSet<>();
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list,1,12,22,1,34,12,56,22,78);
		int size = list.size();
		Set<Integer> set1 = new HashSet<>(list);
		for(int i=0; i<size; i++) {
			Set<Integer> set1 = new HashSet<>(list);
					
			
		}
		
		set.add(1);
		set.add(12);
		Collections.addAll(set,1,12,22,1,34,12,56,22,78);
		System.out.println(set);
		

	}

}
