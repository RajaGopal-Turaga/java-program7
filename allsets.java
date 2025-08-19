package aits;
import java.util.Map;
import java.util.TreeMap;

public class allsets {
	    public static void main(String[] args) {
	        Map<String, Integer> map = new TreeMap<>();
	        
	        map.put("apple", 10);
	        map.put("banana", 20);
	        map.put("orange", 30);
	        
	        System.out.println("TreeMap (sorted keys): " + map);
	        System.out.println("Value for key 'banana': " + map.get("banana"));
	    }
	}

