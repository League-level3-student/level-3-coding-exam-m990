import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
		int pairs = 0;
		for (String s: map1.keySet()) {
			for (String s1: map2.keySet()) {
				if (s.equals(s1)) {
					if (map1.get(s).equals(map2.get(s1))) {
						pairs++;
					}
				}
			}
		}
		return pairs;
	}
}
