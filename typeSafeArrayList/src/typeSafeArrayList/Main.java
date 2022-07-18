package typeSafeArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Ankara");
		cities.add("�zmir");
		cities.add("Ayd�n");
		cities.add("�stanbul");
		cities.remove("Ankara");
		Collections.sort(cities);
		
		for(String a : cities) {
			System.out.println(a);
		}
	}
}
