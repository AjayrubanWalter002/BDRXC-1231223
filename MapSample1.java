package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSample1 {
 public static void main(String[] args) {
	 Map<Integer, String> names=new HashMap<>();
	 names.put(1, "A");
	 names.put(2, "C");
	 names.put(3, "D");
	 names.put(4, "B");
//	 for(Entry<Integer, String> m:names.entrySet()) {
//		 System.out.println(m.getKey()+"="+m.getValue());
//	 }
	 System.out.println("Comparing By Key");
	 names.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	 System.out.println("-----------");
	 names.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	 System.out.println("Comparing BY Value");
	 names.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	 System.out.println("-----------");
	 names.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
 }
}
