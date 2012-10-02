package com.gravypod.MicroTiming;

import java.util.HashMap;
import java.util.Random;


public class MicroTiming {
	
	static int stuff = 20;
	
	static HashMap<Long, Integer> intMap = new HashMap<Long, Integer>();
	
	static Random r = new Random();
	
	static Object o = new Object();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int how_many = 1000000;
		
		long running_time = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < how_many; i++) {
			
			if (o instanceof Integer) {
				
			}
			
			long end = System.currentTimeMillis();
			long len = end - start;
			running_time += len;
			
			if (i % 100000 == 0) {
				
				float round_avg = ((float) running_time) / ((float) i + 1);
				System.out.println(String.format("Running average: %f ms", round_avg));
				
			}
			
		}
		
		float full_avg = ((float) running_time) / (float) (how_many);
		System.out.println(String.format("It took on average %f ms to search through %d times", full_avg, how_many));
		System.out.println(String.format("I searched %d times", how_many ));
		System.out.println(String.format("I took %d ms to do this", running_time));
		
	}
	
}
