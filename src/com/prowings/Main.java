package com.prowings;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    int[] intArray = {1, 2, 3, 4, 5};
    IntStream intStream = Arrays.stream(intArray);

    intStream.forEach(System.out::println);
  }
}