package com.collection.performance;

import java.util.Collection;
import java.util.TreeSet;

public class TestePerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		//Collection<Integer> teste = new HashSet<>(); //Interface Set
		//Collection<Integer> teste = new LinkedHashSet<>(); //Interface Set
		Collection<Integer> teste = new TreeSet<>(); //Interface Setm SortedSet
		//Collection<Integer> teste = new ArrayList<>(); //Interface List
		//Collection<Integer> teste = new Vector<>(); //Interface List
		//Collection<Integer> teste = new LinkedList<>(); //Interface List, Queue
		//Collection<Integer> teste = new PriorityQueue<>(); //Interface Queue
		
		//Map<Integer, String> teste = new Hashtable<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new LinkedHashMap<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new HashMap<Integer, String>(); // Interface map
		//Map<Integer, String> teste = new TreeMap<Integer, String>(); // Interface map, SortedMap
		
		
		long inicio = System.currentTimeMillis();

		int total = 30000;

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
