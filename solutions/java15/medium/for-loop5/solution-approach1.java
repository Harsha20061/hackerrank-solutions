// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop5/problem?isFullScreen=true
// Problem     for loop5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-21, 10:08 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a Prime Number");
        }else{
             System.out.println(n+" is not a Prime Number");
        }
    }
}
