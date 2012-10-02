package com.gravypod.MicroTiming;

import java.util.HashMap;
import java.util.Random;


public class MicroTiming {
	
	static int stuff = 20;
	
	static HashMap<Long, Integer> intMap = new HashMap<Long, Integer>();
	
	static Random r = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int how_many = 1000000;
		
		long running_time = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < how_many; i++) {
			
			switch (stuff) {
				case 1:
					break;
				case 10:
					break;
				case 11:
					break;
				case 99:
					break;
				case 2097498:
					break;
				case 999:
					break;
				case 9:
					break;
				case 574385:
					break;
				case 1213:
					break;
				case 3975:
					break;
				case 248:
					break;
				case 20:
					break;
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
