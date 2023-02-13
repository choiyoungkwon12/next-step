package org.onion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    private StringCalculator cal;

    @BeforeEach
    void setUp() {
        cal = new StringCalculator();
    }

    @Test
    @DisplayName("null, 빈문자인 경우 0 반환")
    void add() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    @DisplayName("숫자가 하나인 경우")
    void addTest2() {
        assertEquals(1, cal.add("1"));
    }

    @Test
    @DisplayName("숫자 두개를 쉼표로 구분하는 경우")
    void addTest3() {
        assertEquals(2, cal.add("1,1"));
    }

    @Test
    void addTest4() {
        assertArrayEquals(new String[]{"1"}, "1".split(","));
        assertArrayEquals(new String[]{"1", "2"}, "1,2".split(","));
    }

    @Test
    @DisplayName("숫자에 음수가 존재")
    void addTest5() {
        assertEquals(6, cal.add("1,2,3"));
        assertThrows(RuntimeException.class, () -> cal.add("-1,4,9"));
    }

}
