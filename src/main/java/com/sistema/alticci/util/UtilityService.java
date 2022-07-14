package com.sistema.alticci.util;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {
	
	/*
	 * GET Element position in array
	 */
	@Cacheable("numbers")
	public int getValueIndex(int elem) {
		try {
			System.out.println("Waiting 3 seconds for simulate generation next number....");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//position in 0=0, 1=1, 2=1. >2 calculate
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(1);
		l.add(1);
		
		//n > 2 => a(n) = a(n-3) + a(n-2)i
		if (elem > 2) {
			for (int i = 3; i < elem; i++) {
				int calc = (i-3) + (i-2);
				l.add(calc);
			}
		}
		
		if (elem <= 2) 
			return l.get(elem);
		else
			return l.get(elem-1);
	}

}
