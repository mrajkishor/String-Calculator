package org.reactive.stringcalculator;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
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
            List<Integer> negativeNumbers = new ArrayList<>();
            int sum = 0;
            for (String num : numberArray) {
                int number = Integer.parseInt(num.trim());
                if (number < 0) {
                    negativeNumbers.add(number);
                }
                sum += number;
            }

            if (!negativeNumbers.isEmpty()) {
                throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
            }

            return sum;
        }
}
