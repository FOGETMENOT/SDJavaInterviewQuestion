package M01_MapDemo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_05GroupbyLength {
public static void main(String[] args) {
	String[] arr= {"cat","apple","dog","banana","grape"};
	//map <length> list word
	Map<Integer,List<String>> map=new HashMap<>();
	for(String word:arr)
	{
		int len=word.length();
		map.computeIfAbsent(len,k->new ArrayList<>()).add(word);
	}
	//
	for(Map.Entry<Integer,List<String>> entry:map.entrySet())
	{
		System.out.println(entry.getKey()+"->"+entry.getValue());
	}
		
}
}
