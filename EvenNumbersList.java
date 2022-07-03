package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(12);
		intList.add(22);
		intList.add(34);
		intList.add(31);
		intList.add(97);
		intList.add(1154);
		intList.add(32);
		intList.add(2445);
		intList.add(57);
		intList.add(88);
		
		for(Integer evenNumber:intList)
		{
			if(evenNumber%2 == 0) {
				System.out.println(evenNumber);
			}
				
		}

	}

}
