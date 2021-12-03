package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Challenge.sum = 1000;

        Challenge.addAverageOf(9, 11);
        Assertions.assertEquals(1010, Challenge.sum);

        Challenge.addAverageOf(0, 0);
        Assertions.assertEquals(1010, Challenge.sum);

        Challenge.addAverageOf(1, 3);
        Assertions.assertEquals(1012, Challenge.sum);
    }
}
