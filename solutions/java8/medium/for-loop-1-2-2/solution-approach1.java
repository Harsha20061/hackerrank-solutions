// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop-1-2-2/problem?isFullScreen=true
// Problem     for loop 1 2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 09:39 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            for(int i=-2;i>=n;i-=2){
                
                    System.out.print(i+" ");
                
            }
            
        }else{
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
