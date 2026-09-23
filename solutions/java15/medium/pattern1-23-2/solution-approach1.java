// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern1-23-2/problem?isFullScreen=true
// Problem     Pattern1 23
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 11:25 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n<0){
        System.out.println("No output generated");
       } 
       else{
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       }
    }
}
