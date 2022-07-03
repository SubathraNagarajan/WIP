package week2.day2;

import java.security.KeyStore.Entry;
import java.util.*;

public class LaernMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(62533, "Subathra");
		map.put(243259,"Devi");
		map.put(2453010, "Nagarajan");
		
		System.out.println(map);
	//	String string = map.get(
		Set<Integer> keySet = map.keySet();
		for(Integer eachKey: keySet)
		{
			System.out.println(eachKey+ "->" +map.get(eachKey));
		}

	/*	Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> eachValue : entrySet)
		{
			System.out.println(eachValue.getKey() + "->" eachValue.getValue());
		}
		
*/		
		
	}

}
