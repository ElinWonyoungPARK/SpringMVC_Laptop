package com.example.demo.www.chap02;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.example.demo.cmm.utl.Util;

import lombok.Data;


public class AppleController2 extends Util{	
	@SuppressWarnings("deprecation")
	public static void main(String... args) {
		AppleService as = new AppleService();
		List<Apple> ls = Arrays.asList(
				new Apple[]{new Apple(80, Color.GREEN),
						new Apple(90, Color.GREEN),
						new Apple(100, Color.RED),
						new Apple(110, Color.RED),
						new Apple(120, Color.RED)});
/*	
		// 명령형
		for(String s : ls2) {
			System.out.println(s);
		}
		System.out.println();
		// 선언형
		Stream<String> s = ls.stream();
		s.forEach(System.out::print);

	*/
		Stream<Apple> s = ls.stream();
		
	
	}
	

