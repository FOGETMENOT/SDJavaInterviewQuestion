package M01_MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Map_02CountRepeatedWordfromstring {
	
	
	public static void main(String[] args) {
		String inputString="Test Automation Java Automation";
		HashMap<String,Integer> charCountMap = new HashMap<>();
		for(String s :inputString.split(" "))
		{
		if(charCountMap.containsKey(s))
		{ 
			
			charCountMap.put(s,charCountMap.get(s)+1);
			}
		
		else{ 
		
		charCountMap.put(s,1);
		}
		}
		System.out.println("Count of Characters in a given string : " +
		charCountMap);
		
	
	
	// print result view print result evry time belore writing program
		for(Map.Entry<String,Integer> entry:charCountMap.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
}
}
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	