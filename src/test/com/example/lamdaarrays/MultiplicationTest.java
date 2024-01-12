package com.example.lamdaarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @org.junit.Test
    public void Multiplication() {
        int Result = Multiplication.multiply(6,3);
        int Correct = (18);
        assertEquals(18, Result);

    }
}
