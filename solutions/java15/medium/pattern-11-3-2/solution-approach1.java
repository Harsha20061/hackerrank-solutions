// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern-11-3-2/problem?isFullScreen=true
// Problem     pattern 11 3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 11:26 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
       }
for(int i=n-1;i>=1;i--){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
       }
    }
}
