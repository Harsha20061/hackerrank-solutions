// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-9/problem?isFullScreen=true
// Problem     while loop 9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:30 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orig = n;
        n = Math.abs(n);
        int sum=0;
        if(orig>=0){
            while(n>0){
                int r=n%10;
                System.out.print(r);
                sum+=r;
                n/=10;
                if(n>0){
                    System.out.print("+");
                }
            }
            System.out.print("="+sum);
        }
        else{
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            System.out.print("Sum is :"+sum);
        }
    }
}
