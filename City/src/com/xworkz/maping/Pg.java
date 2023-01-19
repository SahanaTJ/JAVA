package com.xworkz.maping;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public interface Pg {
	public static void main(String[] args) {
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("Moon", 3500.00);
		map.put("Star", 4000.00);
		map.put("Moring", 5500.00);
		map.put("SUN", 5000.00);
		map.put("Manjunatha", 4500.00);
		map.put("Sagar", 4800.00);
		map.put("Sahana", 6500.00);
		map.put("Shalini", 6000.00);
		map.put("Annnaya", 7500.00);
		map.put("Sangeetha", 8000.00);
		System.out.println(map.size());
		
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		System.out.println("=====Values=======");
		Collection<Double> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("============");
	Set<Entry<String,Double>> entries=map.entrySet();
	for(Entry<String,Double> entry:entries) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
		
		
		
	}

}


