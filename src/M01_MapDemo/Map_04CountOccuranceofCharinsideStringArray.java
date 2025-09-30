package M01_MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Map_04CountOccuranceofCharinsideStringArray {
public static void main(String[] args) {
	String[] arr= {"apple","banana","dates","oranges"};
	char target='e';
	Map<String,Integer> map=new HashMap<>();
	for(String word:arr)
	{
	int count=0;
	
	for(char ch:word.toCharArray())
	{
if(ch==target)
{
	count++;
	}
	}
	
	
	
	
	if(count>0) {
		map.put(word,count);
	}
	}
	
	// print result 
	
	
	
	
	for(Map.Entry<String,Integer> Entry:map.entrySet())
	{
		System.out.println(Entry.getKey()+"->"+Entry.getValue());
	}
}
}
