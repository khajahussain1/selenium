package java_interview_questions;

import org.testng.annotations.Test;

public class HashMap_and_HashTable 
{
	@Test
	public void difference_between_HashMap_and_Hashtable()
	{
		/*
		 * 
		 * 
		 * Methods in Map Interface:

1. public Object put(Object key, Object value): This method is used to insert an entry in this map.

2. public void putAll(Map map): This method is used to insert the specified map in this map.

3. public Object remove(Object key): This method is used to delete an entry for the specified key.

4. public boolean remove(Object key, Object value): It removes the specified values with the associated specified keys from the map.

5. public boolean equals(Object o): It is used to compare the specified Object with the Map.

6. public Object get(Object key):This method is used to return the value for the specified key.

7. public boolean containsKey(Object key): This method is used to search the specified key from this map.

8. public boolean containsValue(Object value): This method returns true if some value equal to the value exists within the map, 
       else return false.
       
9. public Set keySet(): This method is used to return the Set view containing all the keys.

10. public Set entrySet(): This method is used to return the Set view containing all the keys and values.

		What is the difference between HashMap and Hashtable?
		
					HashMap	                                          Hashtable
					
				1)	HashMap is not synchronized.	          Hashtable is synchronized.
				2)	HashMap can contain one null key and      Hashtable cannot contain any null key or null value.
				    multiple null values.	
				3)	HashMap is not ?thread-safe,? so it is    Hashtable is thread-safe, and it can be shared between various threads.
				    useful for non-threaded applications.	
				4)  HashMap inherits the AbstractMap class    Hashtable inherits the Dictionary class.
				
				*/
	}
	
	@Test
	public void HashTable()
	{
		/*
		Java Hashtable class
		Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements 
		the Map interface.

		Points to remember
		A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by 
		calling the hashcode() method. 
		A Hashtable contains values based on the key.
		Hashtable class contains unique elements.
		Hashtable class doesn't allow null key or value.
		Hashtable class is synchronized.
		The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
		
		*/
	}

}
