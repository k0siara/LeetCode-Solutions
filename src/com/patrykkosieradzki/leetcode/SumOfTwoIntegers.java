package com.patrykkosieradzki.leetcode;

/**
 * 371. Sum of Two Integers
 * <p>
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * <p>
 * Example 1:
 * <p>
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 * <p>
 * Input: a = -2, b = 3
 * Output: 1
 */

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        System.out.println(getSum(2, 4));
    }

    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getSum(a ^ b, (a & b) << 1);
        }
    }

}
