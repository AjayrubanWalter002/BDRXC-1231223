package Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Merge {
 public static void main(String[] args) {
	List<Integer> nums1=Arrays.asList(1,2,3,4,5);
	List<Integer> nums2=Arrays.asList(6,7,8,9,10);
	List<List<Integer>> nums=Arrays.asList(nums1,nums2);
List<Integer>vals=	nums.stream().flatMap(k->k.stream()).collect(Collectors.toList());
//Object[] res=vals.toArray();
 Integer[] nams=vals.stream().toArray(Integer[]::new);
 for(Integer l:nams) {
 System.out.println(nams.toString());
 }
// String[] namesArray = names.stream().toArray(String[] ::new);  
}
}
