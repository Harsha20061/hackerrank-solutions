// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-10/problem?isFullScreen=true
// Problem     while loop 10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:33 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int count =0;
        while(n!=0){
            int r = n%10;
            if(r==1){
                count++;
            }
            n/=10;
        }
        System.out.println("Number of 1's in a Given Number:"+count);
    }
}
