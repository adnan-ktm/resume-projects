package com.java.learnings.java8;

import java.util.*;
import java.util.stream.*;

public class StreamsExample {

	List<String> studentNames = new ArrayList<>();
	studentNames.add("Adnan");
	studentNames.add("Zafar");
	studentNames.add("John");
	studentNames.add("Doe");

	void streamIntegers() {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
	}

	void printEvenNumbers() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
	}

	void streamNameFilterwithA() {
		studentNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
	}

	void sortStudentNames() {
		studentNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}

	void printStudenList() {
		studentNames.forEach(System.out::println);
	}

	void newStudentList() {
		List<String> memNamesInLowercase = studentNames.stream().sorted().map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInLowercase);

	}

	void countWithStartingLetter(String startLetter) {
		long totalMatched = studentNames.stream().filter((s) -> s.startsWith(startLetter)).count();

		System.out.println(totalMatched);
	}

}
