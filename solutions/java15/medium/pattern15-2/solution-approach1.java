// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern15-2/problem?isFullScreen=true
// Problem     pattern15 2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 09:31 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("No output generated");
            return ;
        }
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}
