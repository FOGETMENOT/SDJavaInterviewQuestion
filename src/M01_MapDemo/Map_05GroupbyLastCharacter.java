package M01_MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_05GroupbyLastCharacter {
public static void main(String[] args) {
	String[] arr= {"apple","banana","pineapple","cat","ant","dog"};
	
	Map<Character,List<String>> map=new HashMap<>();
	for(String word:arr)
	{
		char lastchar=word.charAt(word.length()-1);// for 2nd last cgar put 2 instead of one
		
		map.computeIfAbsent(lastchar,k->new ArrayList<>()).add(word);
			
			
		
	}

	System.out.println(map);
	//print result
	
	
	for(Map.Entry<Character,List<String>> entry:map.entrySet())
	{
		System.out.println(entry.getKey()+"->"+entry.getValue());
	}
	
}
}
