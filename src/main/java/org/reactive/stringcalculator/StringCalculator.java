package org.reactive.stringcalculator;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator  {
        public int add(String numbers) {
            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }

            String delimiter = ",|\n";
            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf("\n");
                delimiter = numbers.substring(2, delimiterIndex);
                numbers = numbers.substring(delimiterIndex + 1);
            }

            String[] numberArray = numbers.split(delimiter);
            int sum = 0;

            checkNegativeNumbers(numberArray);

            for (String num : numberArray) {
                int number = Integer.parseInt(num.trim());
                sum += number;
            }

            return sum;
        }

    private static void checkNegativeNumbers(String[] numberArray) {
        List<Integer> negativeNumbers = new ArrayList<>();
        for (String num : numberArray) {
            int number = Integer.parseInt(num.trim());
            if (number < 0) {
                negativeNumbers.add(number);
            }
        }
        if(!negativeNumbers.isEmpty())
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
    }
}
