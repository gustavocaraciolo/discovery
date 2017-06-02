package com.map.performance;

import java.util.Map;
import java.util.TreeMap;

public class TestePerformance {
	public static void main(String[] args) {
		/* tempo médio para adicionar - 7ms 
		 * total 15ms*/
		//Map<Integer, String> teste = new Hashtable<Integer, String>(); // Interface map
		
		/* tempo médio para adicionar - 11ms 
		 * total 16ms*/
		//Map<Integer, String> teste = new LinkedHashMap<Integer, String>(); // Interface map
		
		/* tempo médio para adicionar - 10ms 
		 * total 17ms*/
		//Map<Integer, String> teste = new HashMap<Integer, String>(); // Interface map
		
		/* tempo médio para adicionar - 17ms 
		 * total 27ms*/
		Map<Integer, String> teste = new TreeMap<Integer, String>(); // Interface map, SortedMap
		
		long inicio = System.currentTimeMillis();
		
		int total = 50000;
		
		for (int i = 0; i < total; i++) {
			teste.put(i, "valor qualquer");
		}
		
		for(Map.Entry<Integer, String> entry : teste.entrySet()){
			teste.containsKey(entry.getKey());
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
