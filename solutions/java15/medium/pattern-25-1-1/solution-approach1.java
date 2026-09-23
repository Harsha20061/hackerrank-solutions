// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern-25-1-1/problem?isFullScreen=true
// Problem     pattern 25 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-24, 12:13 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // First row
        for (int j = 1; j <= n; j++) {
            System.out.print("*");
            if (j < n) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Remaining rows
        for (int i = 2; i <= n; i++) {

            // Left indentation
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Left star
            System.out.print("*");

            // Space between stars
            int spaces = 2 * (n - i) - 1;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right star, except last row
            if (i < n) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
