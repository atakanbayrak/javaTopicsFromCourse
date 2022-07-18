package arrayListDemo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		/*int[] numbers = new int[] {1,2,3};
		numbers = new int[4];
		System.out.println(numbers[0]);*/
		
		ArrayList numbers= new ArrayList();
		
		numbers.add(1);
		numbers.add(10);
		numbers.add("Atakan");
		
		System.out.println(numbers.size());
		numbers.set(0, 100);
		System.out.println(numbers.get(0));
		numbers.remove(0);
		System.out.println(numbers.get(1));
		
		for(Object i :numbers) {
			System.out.println(i);
		}
		numbers.clear();
		
	}
}
