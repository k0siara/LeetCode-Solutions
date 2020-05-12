package com.patrykkosieradzki.leetcode;

/**
 * 521. Longest Uncommon Subsequence I
 * <p>
 * Given two strings, you need to find the longest uncommon subsequence of this two strings. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other string.
 * <p>
 * A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
 * <p>
 * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "aba", b = "cdc"
 * Output: 3
 * Explanation: The longest uncommon subsequence is "aba",
 * because "aba" is a subsequence of "aba",
 * but not a subsequence of the other string "cdc".
 * Note that "cdc" can be also a longest uncommon subsequence.
 * Example 2:
 * <p>
 * Input: a = "aaa", b = "bbb"
 * Output: 3
 * Example 3:
 * <p>
 * Input: a = "aaa", b = "aaa"
 * Output: -1
 */

public class LongestUncommonSubsequenceI {

    public static void main(String[] args) {
        System.out.println(findLUSlength("aaa", "aaa"));
    }

    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
