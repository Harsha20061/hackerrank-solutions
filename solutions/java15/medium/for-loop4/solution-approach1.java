// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop4/problem?isFullScreen=true
// Problem     for loop4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-21, 10:03 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
               System.out.println();
        System.out.print("no of factors:"+count);
    }
}
