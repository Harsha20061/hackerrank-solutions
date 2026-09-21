// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop3/problem?isFullScreen=true
// Problem     for loop3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-21, 09:55 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<0){
            System.out.print("No Series Generated");
        }
        else{
            for(int i=1;i<=n;i++){
               System.out.print((i*3)+" "); 
            }
        }
    }
}
