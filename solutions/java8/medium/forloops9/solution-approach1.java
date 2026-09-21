// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/forloops9/problem?isFullScreen=true
// Problem     forloops9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 09:10 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("No Output Generated");
        }else{
            
        
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            continue;
            System.out.print(i+" ");
        }
        }
    }
}
