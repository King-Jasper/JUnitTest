package com.example.lamdaarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @org.junit.Test
    public void Addition() {
       int Result = Addition.add(4,5);
       int Correct = (9);
       assertEquals(9, Result);

    }
}