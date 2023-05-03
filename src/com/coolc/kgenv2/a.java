package com.coolc.kgenv2;

import java.util.Random;

public class a {
	
	public static String a[] = {
			"te rákos",
			"te",
			"te rákatlan",
			"te macskátlan",
			"te román",
			"te terdikféle rasszista,",
			"még mindig nem tudod mi az a 2, de te rákos",
			"you startled feline,"
	};
	
	public static String b[] = {
			"hüly",
			"2",
			"3 utáló",
			"ésszakkeleti elnök",
			"bolond",
			"ne legyél az",
			"indev+ utáló",
			"avagy megijedt macska"	
	};
	
	public static void main(String [] args) {
		Random x = new Random();
		int y = x.nextInt(8);
		String c = a[y];
		y = x.nextInt(8);
		String d = b[y];
		System.out.printf("%s %s", c, d);
	}
}
