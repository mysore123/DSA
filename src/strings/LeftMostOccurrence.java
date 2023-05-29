package strings;

import java.util.HashMap;
import java.util.Map;

public class LeftMostOccurrence {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("cabbad");
        getLeftMostRepeatingOccurrence(s);
    }

    private static Integer getLeftMostRepeatingOccurrence(StringBuilder s) {
        Map<Character, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Map<Integer, Integer> innerMap = map.get(s.charAt(i));
                Integer key = innerMap.keySet().iterator().next();
                innerMap.put((int)key, (int)innerMap.get(key));
            }
            map.put(s.charAt(i), Map.of(i , 1));
        }
        final Integer[] mostRepeating = {-1};
        map.forEach((k,v) -> {
            Map<Integer, Integer> innerMap = map.get(k);
            if (innerMap.get(innerMap.keySet().iterator().next()) > 1) {
                mostRepeating[0] = innerMap.keySet().iterator().next();
            }
        });
        return mostRepeating[0];
    }
}
