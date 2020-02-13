package java_interview_questions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Practice {

	@Test
	public void test() {

		Hashtable<String, String> ht = new Hashtable<String, String>();

		ht.put("khaja", "9290543618, 78656");
		ht.put("hussain", "7358681940");
		ht.put("poola", "9290543627");

//		System.out.println(ht.keySet());
//		System.out.println(ht.entrySet());

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
for(int j=0; j<=2; j++) {
		HashMap<String, String> newMap = new HashMap<String, String>();
		for (int i = 0; i <= 10; i++) {
			newMap.put(j+"a" + i, j+" Rama " + i);
		}
		list.add(newMap);
	}
		System.out.println(list);
		
		//for (HashMap<String, String> hashMap : list) {
		HashMap<String, String> hashMap=list.get(2);
			
			for (String key : hashMap.keySet()) {
			
				System.out.println(hashMap.get(key));
			}
			
		//}
		
	}
}
