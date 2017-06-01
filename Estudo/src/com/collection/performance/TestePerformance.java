package com.collection.performance;

import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		/* tempo médio para adicionar - 12ms 
		 * total 15ms*/
		Collection<Integer> teste = new HashSet<>(); //Interface Set
		
		/* tempo médio para adicionar - 14ms 
		 * total 15ms*/
		//Collection<Integer> teste = new LinkedHashSet<>(); //Interface Set
		
		/* tempo médio para adicionar - 16ms 
		 * total 26ms*/
		//Collection<Integer> teste = new TreeSet<>(); //Interface Setm SortedSet
		
		/* tempo médio para adicionar - 3ms 
		 * total 1109ms*/
		//Collection<Integer> teste = new ArrayList<>(); //Interface List
		
		/* tempo médio para adicionar - 4ms 
		 * total 1130ms*/
		//Collection<Integer> teste = new Vector<>(); //Interface List
		
		/* tempo médio para adicionar - 4ms 
		 * total 3311ms*/
		//Collection<Integer> teste = new LinkedList<>(); //Interface List, Queue
		
		/* tempo médio para adicionar - 6ms 
		 * total 1099ms*/
		//Collection<Integer> teste = new PriorityQueue<>(); //Interface Queue
		
		//Map<Integer, String> teste = new Hashtable<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new LinkedHashMap<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new HashMap<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new TreeMap<Integer, String>(); // Interface map, SortedMap
		
		
		long inicio = System.currentTimeMillis();

		int total = 50000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
