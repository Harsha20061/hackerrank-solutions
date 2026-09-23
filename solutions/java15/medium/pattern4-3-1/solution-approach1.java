// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/pattern-test1/challenges/pattern4-3-1/problem?isFullScreen=true
// Problem     pattern4 3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-23, 11:44 a.m.
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
                for(int j=n;j>n-i;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
