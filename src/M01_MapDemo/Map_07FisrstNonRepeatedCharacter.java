package M01_MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_07FisrstNonRepeatedCharacter {
public static void main(String[] args) {
	String str="Automation";
	Map<Character,Integer> map=new HashMap<>();
	for(char word:str.toCharArray())
	{
		map.put(word,map.getOrDefault(word,0)+1);
		
	}
	

	//print result of map using get key and getvalue
	
	for(Entry<Character, Integer> entry :map.entrySet())
	{
		if(entry.getValue()==1)
		{
		System.out.println(entry.getKey()+"->"+ entry.getValue());
		break;
	}}
}
}
