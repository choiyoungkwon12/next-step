package org.onion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private static int RESULT = 2;
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // 각 메서드 마다 초기화 하는데 이 코드가 필요한 이유는 각 메서드 간 의존성을 끊기 위함.
        // 만약 하나의 인스턴스로 모든 테스트 코드를 수행하면 먼저 수행한 테스트가 나중에 테스트 메서드에서 영향을 미칠 수 있음.
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(calculator.add(1, 1), RESULT);
    }

    @Test
    void subtract() {
        assertEquals(calculator.subtract(3, 1), RESULT);
    }

    @Test
    void multiply() {
        assertEquals(calculator.multiply(2, 1), RESULT);
    }

    @Test
    void divide() {
        assertEquals(calculator.divide(4, 2), RESULT);
    }
}
