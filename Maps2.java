package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Maps2 {
 public static void main(String[] args) {
	HashMap<Integer, String> nums=new HashMap<>();
	nums.put(1, "A");
	nums.put(2, "B");
	nums.put(3, "C");
	nums.put(4, "D");
	
	nums.keySet().forEach(i -> {
		if (nums.get(i).equals("Ruban")) {
			System.out.println(nums.get(i));
		}
	});
	nums.keySet().forEach(k->{
		nums.get(k).valueOf(k);
	});
 }
}
