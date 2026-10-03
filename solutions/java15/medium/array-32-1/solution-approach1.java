// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array-32-1/problem?isFullScreen=true
// Problem     Array 32 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-03, 02:09 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String[] a = line1.trim().split("\\s+");
        String[] b = line2.trim().split("\\s+");

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            int x = Integer.parseInt(a[i]);
            int y = Integer.parseInt(b[j]);

            if (x <= y) {
                System.out.print(x + " ");
                i++;
            } else {
                System.out.print(y + " ");
                j++;
            }
        }

        // Remaining elements of first array
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }

        // Remaining elements of second array
        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
