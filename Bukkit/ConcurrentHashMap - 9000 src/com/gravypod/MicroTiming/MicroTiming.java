package com.gravypod.MicroTiming;

import java.util.concurrent.ConcurrentHashMap;

public class MicroTiming {
	
	static ConcurrentHashMap<Long, Integer> listTest = new ConcurrentHashMap<Long, Integer>();
	
	public static String[] possible_commands = { "Hello", "hello", "asdf", "allyourbase", "nope", "ls", "ps", "thwsgawekjhrojhgpajkf", "everything_you_know_is_wrong", "Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Sydney", "Helsinki", "Perth", "Auckland", "Zurich", "Munich", "Düsseldorf", "Frankfurt" };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int how_many = 5;
		
		System.out.println(String.format("I have %d items to search through", possible_commands.length));
		
		long running_time = 0;
		
		for (int i = 0; i < how_many; i++) {
			
			long start = System.currentTimeMillis();
			
			for (int x = 0; x < 9000; x++) {
				
				listTest.put((long) x, x);
				
				for (Long s1 : listTest.keySet()) {
					
					if (listTest.containsKey(s1))
						if (listTest.get(s1) == x) 
							break;
					
				}
				
			}
			
			long end = System.currentTimeMillis();
			long len = end - start;
			running_time += len;
			
			if (i % 100000 == 0) {
				
				float round_avg = ((float) running_time) / ((float) i + 1);
				System.out.println(String.format("Running average: %f ms", round_avg));
				
			}
			
		}
		
		float full_avg = ((float) running_time) / (float) (how_many * possible_commands.length);
		System.out.println(String.format("It took on average %f ms to search through %d items %d times", full_avg, possible_commands.length, how_many));
		System.out.println(String.format("I searched %d times", how_many * possible_commands.length));
		System.out.println(String.format("I took %d ms to do this", running_time));
		
	}
	
}
