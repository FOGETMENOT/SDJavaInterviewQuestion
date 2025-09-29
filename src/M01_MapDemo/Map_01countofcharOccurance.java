package M01_MapDemo;

import java.util.HashMap;

public class Map_01countofcharOccurance {

public static void main(String[] args) {
String str="sentencence";
HashMap<Character,Integer> hm=new HashMap();
for(char ch:str.toCharArray())
{
	if(hm.containsKey(ch))
	{
       hm.put(ch, hm.get(ch)+1);
	}
	else
	{
		hm.put(ch,1);
		
	}
	}
System.out.println(hm);
	}

}
