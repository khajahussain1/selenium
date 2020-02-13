package java_interview_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Khaja {

       @Test
       public void has() {
              HashMap<Integer, String> map = new HashMap<>();
             /* map.put("abc", 2);
              map.put("def", 1);
              map.put("hij", 4);
              map.put("klm", 6);
              map.put("nop", 2);
              map.put("qrs", 2);
              map.put("tuv", 6);
              map.put("wxy", 8);
              map.put("zab", 1);
              map.put("cde", 5);
              map.put("fgh", 4);
              map.put("ijk", 3);*/
              
              map.put(100, "A");
              map.put(101, "A");
              map.put(102, "B");
              map.put(103, "C");
              map.put(104, "B");
              map.put(105, "A");
              map.put(106, "A");
              map.put(107, "B");
              map.put(108, "C");
              map.put(110, "B");
              

              HashMap<String, Object> duplicatMap = new HashMap<>();

              Set<Entry<Integer, String>> entrySet = map.entrySet();
              Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
              while (iterator.hasNext()) {
                     Entry<Integer, String> entry = iterator.next();
                     Integer key = entry.getKey();
                     String value = entry.getValue();

                     if (duplicatMap.containsKey(value)) {
                            duplicatMap.put(value, duplicatMap.get(value) + ","+ key);
                     } else {
                           duplicatMap.put(value, key);  //2,abcs
                     }
              }
              System.out.println(duplicatMap);

       }
}
