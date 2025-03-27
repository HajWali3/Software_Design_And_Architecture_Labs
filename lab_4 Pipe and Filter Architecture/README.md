# Pipe and Filter Pattern in Java

## Overview

This Java program implements the **Pipe and Filter** design pattern to process a list of integers through a sequence of transformations and filtering operations. The pipeline consists of multiple filter functions that manipulate the list step by step.

## Features

- **Filter Even Numbers**: Keeps only even numbers.
- **Square Numbers**: Squares each number.
- **Filter Numbers Greater Than 10**: Retains numbers greater than 10.
- **Filter Numbers Less Than 100**: Keeps numbers below 100.
- **Reduce Numbers by Half**: Divides each number by 2.
- **Filter Prime Numbers**: Filters out non-prime numbers.

## How It Works

1. The program initializes a list of integers.
2. A list of filter functions is created.
3. The input list is processed through the filter pipeline sequentially.
4. The final output is printed after all transformations.

## Code Structure

- `processPipeline(List<Integer>, List<Function<List<Integer>, List<Integer>>>)`: Executes the filters sequentially.
- Each filter method transforms the list and prints intermediate results.
- `isPrime(int)`: Checks if a number is prime.
- `printValue(String, List<Integer>)`: Prints the list after each filter stage.

## Example Output

```
Initial input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
After filterOddNumbers: [1, 3, 5, 7, 9, 11, 13, 15]
After squareNumbers: [1, 9, 25, 49, 81, 121, 169, 225]
After filterNumbersGreaterThanTen: [25, 49, 81, 121, 169, 225]
After filterNumbersLessThanHundred: [25, 49, 81]
After reduceNumbersByHalf: [12, 24, 40]
After filterPrime: []
Final Output: []
```
