// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-5-1/problem?isFullScreen=true
// Problem     while loop 5 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 06:44 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" * "+i+" = "+(i*n));
            i++;
        }
    }
}
