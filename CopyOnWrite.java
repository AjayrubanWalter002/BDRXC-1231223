package Collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
 public static void main(String[] args) {
	 CopyOnWriteArrayList<Integer> nums=new CopyOnWriteArrayList<>();
	 nums.add(1);
	 nums.add(2);
	 nums.add(3);
	 nums.add(4);
	 Iterator iterator =nums.iterator();
	  while(iterator.hasNext()) {
		  Integer i=(Integer)iterator.next();
		  System.out.println(i);
		  nums.add(5);
	  }
 }
}
