package org.onion;

import java.util.Arrays;

public class StringCalculator {

    int add(String stringNumber) {
        if (isBlank(stringNumber)) {
            return 0;
        }

        return sum(toInts(stringNumber.split(",|:")));
    }

    private boolean isBlank(String stringNumber) {
        return stringNumber == null || stringNumber.isEmpty();
    }

    private int[] toInts(String[] strings) {
        return Arrays.stream(strings)
            .mapToInt(this::toPositive)
            .toArray();
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    private int sum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
