// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-8/problem?isFullScreen=true
// Problem     while loop 8
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:19 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        if(n==0){
            System.out.println("Number of digits in the given number :"+1);
            
        }else{
            
        while(n!=0){
            int r = n%10;
            count++;
            n/=10;
        }
        System.out.println("Number of digits in the given number :"+count);
    }
}
        }
