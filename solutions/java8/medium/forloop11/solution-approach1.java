// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/forloop11/problem?isFullScreen=true
// Problem     forloop11
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 09:23 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        if(n<0){
            System.out.println("No Series Generated");
        }else{
            
        for(int i=0;i<=n;i++){
            sum +=i;
            if(sum>=n){
                
              break;
            }
            System.out.print(sum+" ");
        }
        }
    }
}
