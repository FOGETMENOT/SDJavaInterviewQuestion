package M01_MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_05GroupbyFirstcharacter {

	public static void main(String[] args) {
		String[] arr= {"cat","apple","dog","banana","grape","bat","ant"};
		//map <length> list word
		Map<Character,List<String>> map=new HashMap<>();
		for(String word:arr)
		{
			char first=word.charAt(0);
			map.computeIfAbsent(first,k->new ArrayList<>()).add(word);
		}
		System.out.println(map);
		//
		for(Map.Entry<Character,List<String>> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
			
	}
	
}