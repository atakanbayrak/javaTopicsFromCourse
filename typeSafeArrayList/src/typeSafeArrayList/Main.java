package typeSafeArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Ankara");
		cities.add("Ýzmir");
		cities.add("Aydýn");
		cities.add("Ýstanbul");
		cities.remove("Ankara");
		Collections.sort(cities);
		
		for(String a : cities) {
			System.out.println(a);
		}
	}
}
