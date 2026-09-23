// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern-10-4-1/problem?isFullScreen=true
// Problem     pattern 10 4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 11:14 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+n;j++){
                if(j%2!=0){
                    System.out.print(j+" ");
                }
                else if(j%4==0){
                    System.out.print("@"+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
                
            }
            System.out.println();
        }
    }
}
