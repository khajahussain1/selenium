package java_interview_questions;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Map_Class {

	//@Test
	public void test() throws ParseException, IOException {

		Map<String, Object> pbook = new HashMap<String, Object>();

		pbook.put("khaja", "9290543618, kjshuydg");
		pbook.put("hussain", "7358681940");
		pbook.put("poola", "9878654783");

		// System.out.println(pbook.get("poola"));

		/*
		 * Set<String> values = new HashSet(pbook.values()); for (String i : values) {
		 * System.out.println(i);
		 * 
		 * }
		 */

		Set<String> key = pbook.keySet();
		Set<String> key2 = new HashSet<String>(pbook.keySet());

		for (String i : key) {
			System.out.println(i);

		}

	}

	// @Test
	public void get_key_values_of_map() {
		Map<String, Object> pbook = new HashMap<String, Object>();

		/*
		 * pbook.put("khaja", "9290543618 is khaja phone number"); pbook.put("hussain",
		 * "9290543618 is khaja phone number"); pbook.put("poola",
		 * "9878654783 is poola phone number");
		 */
		pbook.put("101", "A");
		pbook.put("102", "B");
		pbook.put("103", "C");
		pbook.put("104", "A");
		pbook.put("105", "C");
		pbook.put("106", "B");
		pbook.put("107", "A");
		pbook.put("108", "B");

		// iterate key and values both
		Set<Map.Entry<String, Object>> values = pbook.entrySet();

		HashMap<Object, String> hm = new HashMap<Object, String>();

		for (Map.Entry<String, Object> s : values) {
			// System.out.println(s.getKey() + "-->" + s.getValue());
			// s.setValue("ram");
			String key = s.getKey();
			Object value = s.getValue();
			if (hm.containsKey(value)) {
				hm.put(value, hm.get(value) + "," + key);
			} else {
				hm.put(value, key);
			}

			hm.put(value, hm.get(value) + "," + key);
		}
		System.out.println(hm);

		/*
		 * // iterate key only
		 * 
		 * Set<String> key = pbook.keySet();
		 * 
		 * for (String ke : key) { System.out.println(ke);
		 * 
		 * }
		 * 
		 * // iterate values only
		 * 
		 * Set<String> value = pbook.keySet();
		 * 
		 * for (String v : value) { System.out.println(pbook.get(v));
		 * 
		 * }
		 */

	}

}
