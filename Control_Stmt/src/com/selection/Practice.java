package com.selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class  Practice{
	public static void main(String[] args){
		
		List<String> list = Arrays.asList("Priya", "Neha", "Rita", "Savi", "Riya");
		list.stream().filter(e->e.startsWith("R")).forEach(e->System.out.println(e));
		list.stream().filter((s)->s.length()>=5).map(String::toUpperCase).forEach(e->System.out.println(e));
		
		
		
    }
}