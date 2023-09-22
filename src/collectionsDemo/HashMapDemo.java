package collectionsDemo;


import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	//HasMap class is implementing Map interface --> package java.util
		//Its underlying datastructure is hash table
		//storing data as key and value pair
		//In case of hash map you will store a unique key always
		//But duplicate values are allowed
		//Hash map can consit of only 1 key with data as well

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer , String> td = new HashMap<>();
		// Hash map key and value will be insertes using put() method
		
		td.put(123, "Ravi");
		td.put(1234,  "Sonal");
		td.put(125, "Ashu");
		td.put(123189, "Swati");
		
		//Print the value of the hash map
		//every key and value inserted in the map is of type entry
		//
		
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey( ) + "-"+ m.getValue());
			
		}
		

	}

}
