package M01_MapDemo;

import java.util.HashMap;

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
		}

}
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	