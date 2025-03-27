import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PipeAndFilter {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Create a pipeline
        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();
        filters.add(PipeAndFilter::filterOddNumbers);
        filters.add(PipeAndFilter::squareNumbers);
        filters.add(PipeAndFilter::filterNumbersGreaterThanTen);
        filters.add(PipeAndFilter::filterNumbersLessThanHundred);
        filters.add(PipeAndFilter::reduceNumbersByHalf);
        filters.add(PipeAndFilter::filterPrime);

        // Process the input through the pipeline
        List<Integer> result = processPipeline(input, filters);

        // Output the final result
        System.out.println("Final Output: " + result);
    }

    // Process the input through the pipeline of filters
    private static List<Integer> processPipeline(List<Integer> input,
            List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;
        for (Function<List<Integer>, List<Integer>> filter : filters) {
            output = filter.apply(output);
        }
        return output;
    }

    // Filter to keep even numbers
    private static List<Integer> filterOddNumbers(List<Integer> input) {
        List<Integer> res = input.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        printValue("After filterOddNumbers", res);
        return res;
    }

    // Filter to square the numbers
    private static List<Integer> squareNumbers(List<Integer> input) {
        List<Integer> res = input.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        printValue("After squareNumbers", res);
        return res;
    }

    // Filter to keep numbers greater than 10
    private static List<Integer> filterNumbersGreaterThanTen(List<Integer> input) {
        List<Integer> res = input.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        printValue("After filterNumbersGreaterThanTen", res);
        return res;
    }

    // Filter to keep numbers less than 100
    private static List<Integer> filterNumbersLessThanHundred(List<Integer> input) {
        List<Integer> res = input.stream()
                .filter(n -> n < 100)
                .collect(Collectors.toList());
        printValue("After filterNumbersLessThanHundred", res);
        return res;
    }

    // Reduce each number by half
    private static List<Integer> reduceNumbersByHalf(List<Integer> input) {
        List<Integer> res = input.stream()
                .map(n -> n / 2)
                .collect(Collectors.toList());
        printValue("After reduceNumbersByHalf", res);
        return res;
    }

    // Filter prime numbers
    private static List<Integer> filterPrime(List<Integer> input) {
        List<Integer> res = input.stream()
                .filter(PipeAndFilter::isPrime)
                .collect(Collectors.toList());
        printValue("After filterPrime", res);
        return res;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Helper method to print intermediate results
    private static void printValue(String stage, List<Integer> values) {
        System.out.println(stage + ": " + values);
    }
}
