package M01_MapDemo;

import java.util.HashMap;
import java.util.Map;



public class Map_program01 {
public static void main(String[] args) {
Map<Integer,String> hm=new HashMap();
hm.put(102,"deepak");
hm.put(103,"ankit");
hm.put(105, "Tom");
hm.put(106, "jerry");
Map<Integer,String> hm2=new HashMap();
hm.put(113,"reepak");
hm.put(114,"amit");
hm.put(115, "Tim");
hm.put(116, "lilly");
System.out.println(hm);
//print as object
System.out.println(hm.entrySet());
//print each element 

for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey()+":"+m.getValue());
	}
hm.remove(102);
System.out.println(hm);
hm.replace(106,"tom");
System.out.println(hm);
System.out.println(hm.containsValue("tom"));

Map<Integer,Map<Integer,String>> nested=new HashMap();
nested.put(1,hm);
nested.put(2, hm2);


//in key and value object
System.out.println(nested.entrySet());

//only keys
System.out.println(nested.keySet());
System.out.println(nested.values());



}
}
