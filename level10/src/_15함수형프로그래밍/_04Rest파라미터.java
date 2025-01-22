package _15함수형프로그래밍;

import java.util.Arrays;
import java.util.List;

public class _04Rest파라미터 {
	
	// 매개변수 갯수를 모를때 사용한다 
	public static int getSum(int ...nums) {  // int[] nums
		int sum = 0;
		for(int i =0; i < nums.length;i+=1) sum+=nums[i];
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getSum());
		System.out.println(getSum(10));
		System.out.println(getSum(10,20,30));
		System.out.println(getSum(10,20,30,40,50));
		
		
		List<String> list = Arrays.asList("강아지","고양이","사자","토끼");
		
		for(String element : list) System.out.println(element);
		
		System.out.println("-----------");
		
		list.forEach(element -> System.out.println(element));
		
		System.out.println("------------");
		
		list.forEach(System.out::println);
		
		
	}
}
