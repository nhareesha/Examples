package com.Practice.Examples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicateCharactersInString {

	public static void main(String[] args) {

		String arr = "Hareesha";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();//Using linked hash map preserves the insertion order
		char[] carr = arr.toCharArray();

		for (Character c : carr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Map.Entry<Character, Integer> o = (Map.Entry<Character, Integer>) it.next();
			System.out.println(o.getKey()+":"+o.getValue());
			
		}
	}

}
