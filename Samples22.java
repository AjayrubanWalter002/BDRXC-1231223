package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Samples22 {
 public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(1,2,3,4,5,9,8);
	Sample s=new Sample();
	System.out.println(s.nums(nums));
	Integer max=Collections.max(nums);
//	System.out.println(max);
	Integer maxs=nums.stream().min(Comparator.comparingLong(Integer::intValue)).get();
//	System.out.println(maxs);
	Collections.sort(nums);
	
	for(Integer l:nums) {
//		System.out.println(l);
	}
	Collections.reverse(nums);
	for(Integer j:nums) {
		System.out.println(j);
	}
}
 
} 
