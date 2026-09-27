// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array-30-1/problem?isFullScreen=true
// Problem     Array 30 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-27, 03:55 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int missing = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == missing) {
                missing++;
            }
        }

        System.out.println(missing);
    }
}
