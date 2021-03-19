package me.practice.leetcode.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RecursionToIterationTest {
    private final RecursionToIteration instance = new RecursionToIteration();

    @Test
    public void testGenerateParenthesis() {
        Assert.assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"),
                instance.generateParenthesis(3));
    }

}