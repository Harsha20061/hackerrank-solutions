// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while14-1/problem?isFullScreen=true
// Problem     while14 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:55 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       n = Math.abs(n);
       int esum=0;
       int osum=0;
       while(n!=0){
        int r = n%10;
        if(r%2==0){
            esum+=r;
        }else{
            osum+=r;
        }
        n/=10;
       }
       System.out.println("esum:"+esum);
       System.out.print("osum:"+osum);
    }
}
