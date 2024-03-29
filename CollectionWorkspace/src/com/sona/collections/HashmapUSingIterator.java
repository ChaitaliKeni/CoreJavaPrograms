package com.sona.collections;

import java.util.*;
import java.util.Map.Entry;
public class HashmapUSingIterator {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap();
		map.put(1,"Pranu");
		map.put(2,"Vaiju");
		map.put(3,"Anvee");
		map.put(4,"Chaitu");
		
		//Using set
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Using foreach
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//comparingByKey()
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//comparingByKey() in descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		//comparingByValue()
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
				
		//comparingByKey() in descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
	}

}
/*https://www.testingexcellence.com/4-different-ways-iterate-map-java/
 https://www.codingame.com/playgrounds/6162/6-ways-to-iterate-or-loop-a-map-in-java/
  https://www.geeksforgeeks.org/iterate-map-java/*/