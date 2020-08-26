import java.util.HashMap;
import java.util.Map;

public class Bidihashmap {
    public static void main(String args[]){
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
        Map<String, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (String name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        
        for (Map.Entry<String, Integer> entry : nameAndCount.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        }
    }


}
