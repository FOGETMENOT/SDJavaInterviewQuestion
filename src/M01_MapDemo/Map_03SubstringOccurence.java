package M01_MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Map_03SubstringOccurence {
public static void main(String[] args) {
String[] arr= {"apple","banana","pineapple","custurdapple"};
//substring to search
String substring="app";
Map<String,Integer> map=new HashMap<>();
for(String word:arr)
{
	if(word.contains(substring))
	{
		map.put(word,map.getOrDefault(word,0)+1);
	}
	
	}
//print key value pair
for(Map.Entry<String,Integer> entry:map.entrySet())
{
	System.out.println(entry.getKey()+"->"+entry.getValue());
	}

}
}
