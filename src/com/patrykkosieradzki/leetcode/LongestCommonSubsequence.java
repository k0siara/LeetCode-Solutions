package com.patrykkosieradzki.leetcode;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(longestCommonSubsequence("ezupkr", "ubmrapg"));
        System.out.println(longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
        System.out.println(longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy"));
        System.out.println(longestCommonSubsequence("pmjghexybyrgzczy", "hafcdqbgncrcbihkd"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[] array = new int[text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            int prev = 0;
            for (int j = 1; j <= text2.length(); j++) {
                int temp = array[j];
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    array[j] = prev+1;
                } else {
                    array[j] = Math.max(array[j], array[j - 1]);
                }
                prev = temp;
            }
        }

        return array[text2.length()];
    }
}
