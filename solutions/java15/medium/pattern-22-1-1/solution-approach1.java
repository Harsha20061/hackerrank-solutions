// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern-22-1-1/problem?isFullScreen=true
// Problem     pattern 22 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 11:45 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if(i == 1 || i == n || j == 1 || j == i){
                    System.out.print("* ");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
