package runners;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapSorting {
	
	public static Map<String, Integer> getSortedMap(Map<String, Integer> map){
		List<Map.Entry<String,Integer>> list= new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
				return arg0.getValue().compareTo(arg1.getValue());
			}
			
		});
		Map<String, Integer> result= new LinkedHashMap<>();
		for(Map.Entry<String, Integer> element: list) {
			result.put(element.getKey(), element.getValue());
		}
		return result;
	}
	
	public static void main(String[] args) {
		Map<String, Integer> input= new HashMap<>();
		input.put("Math",98);
		input.put("Hindi",94);
		input.put("English",84);
		input.put("Science",100);
		input.put("OS",100);
		
		System.out.println(getSortedMap(input));
	}
}
