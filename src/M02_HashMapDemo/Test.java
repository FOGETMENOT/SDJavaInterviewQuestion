package M02_HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "tom");
		hm.put(2, "jerry");
		hm.put(3, "tom");
		hm.put(4, "jerry");
		hm.put(3, "lilly");// value get replace
		hm.put(6, null);
		hm.put(null, "john");
		System.out.println(hm);
		// print set [] format

		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

		hm.remove(2);
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("tom"));
		System.out.println(hm.get(4));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		HashMap<Integer, String> allhm = new HashMap<>();
		System.out.println(allhm);
		allhm.putAll(hm);
		System.out.println(allhm);

	}
}