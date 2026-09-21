// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while15-1/problem?isFullScreen=true
// Problem     while15 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 08:00 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int r = n%10;
            if(r==0){
            n/=10;
                
            }else{
                
            System.out.println("last non-zero digit is:"+r);
            break;
            }
        }
    }
}
