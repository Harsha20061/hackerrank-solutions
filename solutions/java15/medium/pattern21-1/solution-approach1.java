// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern21-1/problem?isFullScreen=true
// Problem     pattern21 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 10:57 p.m.
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
        int ch=1;
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j =1 ;j<=2*i-1;j++){
            if(j<i){
                System.out.print(ch++);
            }
            else{
                System.out.print(ch--);
            }
        }
        System.out.println();
       }
    }
}
