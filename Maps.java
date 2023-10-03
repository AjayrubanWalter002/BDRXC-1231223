package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> res = new HashMap<>();
		res.put(1, "Ajai");
		res.put(2, "Ruban");
		res.put(3, "Tom");
		res.put(4, "Jason");
		res.put(5, "Ruban");
		for (Entry<Integer, String> n : res.entrySet()) {
//		System.out.println(n);
		}
//	res.values().forEach(j->System.out.println(j));
		res.keySet().forEach(i -> {
			if (res.get(i).equals("Ruban")) {
				System.out.println(res.get(i));
			}
		});
	}
}
