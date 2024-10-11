package org.reactive.stringcalculator;

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
            int sum = 0;
            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }
}
