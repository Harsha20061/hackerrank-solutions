// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-6-1/problem?isFullScreen=true
// Problem     while loop 6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 06:50 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        if(n<0){
            System.out.println("No Series Generated");
        }
        else{
        while(i<=n){
            System.out.print(i*i+" ");
            i++;
        }
        }
    }
}
