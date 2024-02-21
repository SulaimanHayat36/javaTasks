package org.example.thirdWeek;

import org.junit.Test;

import java.util.*;

public class task1 {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;


        for (int i = m,j=0; i < nums1.length && j < n; i++,j++) {
            nums1[i] = nums2[j];
        }

        System.out.println(Arrays.toString(nums1));


    }

    public static boolean ispalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            return true;
        }
        return false;
    }

    @Test
    public void merge() {


    }
}