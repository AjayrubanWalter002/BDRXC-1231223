package Collections;

import java.util.ArrayList;

public class Sample1 {
 public static void main(String[] args) {
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	nums.set(4, 4);
	System.out.println(nums);
}
}
