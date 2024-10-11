package org.reactive.stringcalculator;

public class StringCalculator {
        public int add(String numbers) {
            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }
            String[] numberArray = numbers.split(",");
            int sum = 0;
            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }
}
