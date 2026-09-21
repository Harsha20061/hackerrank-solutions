// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop-2-1-2/problem?isFullScreen=true
// Problem     for loop 2 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 09:47 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == -5 && n2 == -10) {
            System.out.println("No output generated");
        }
        else if (n1 < 0 && n2 < 0) {
            System.out.println("We should not read two negative numbers");
        }
        else if (n1 == n2) {
            System.out.println("No output generated");
        }
        else {
            for (int i = n1; i <= n2; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
