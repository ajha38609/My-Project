package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of Array list class which is implementing method of list class
		ArrayList<String> cities = new ArrayList<>();
		// checking add() method
		cities.add("London");
		cities.add("Paris");
		cities.add(2,"New Delhi");    //add value at an index in the list
		cities.add("Mumbai");
		
		// Size of Array list
		System.out.println(cities.size());   // Print the number of element in a list
		
	    // print the items in the list
		//for each loop
		
		for(String t: cities)
		{
			System.out.println(t);
		}
		
		

	}

}
