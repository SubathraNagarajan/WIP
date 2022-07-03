package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Vishnu");
		list.add("Suraj");
		list.add("Priya");
		list.add(1,"Karthik");
		System.out.println(list);
		int size = list.size();
		System.out.println(size);
		String string = list.get(0);
		System.out.println(string);
		for (int i=0; i<list.size(); i++) {
			String string2 = list.get(i);
			System.out.println(string2);}
		for(String eachName:list){
			System.out.println(eachName);
		}

	}

}

/*List<String> list = new ArrayList<>();
    list.add("Vishnu");
    list.add("Suraj");
    list.add("Priya");
    list.add("Thanga");
    list.add("Priya");
    list.add("Purush");
    list.add("Varada Rajan");
    
    list.add(1, "Karthik");
    list.set(0, "Charan");
    list.remove(5);
    System.out.println(list);
    int size = list.size();
    System.out.println("Size of the list "+size);
    for (int i = 0; i < list.size(); i++) {
        String string = list.get(i);
        System.out.println(string);
    }
    
    System.out.println("**********************");
    
    Collections.sort(list);
    
    for(String testleaf:list) {
        System.out.println(testleaf);
    }
    
    
    
    
    
    list.clear();
    list.isEmpty();
    boolean contains = list.contains("Charan");*/
