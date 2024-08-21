package com.rays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Stream API to filter odd numbers and print them
        List<Integer> oddNumbers = numbers.stream()
        		                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());
        
        oddNumbers.forEach(System.out::println);
    }
}

