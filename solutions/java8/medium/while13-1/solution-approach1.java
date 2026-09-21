// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while13-1/problem?isFullScreen=true
// Problem     while13 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 08:09 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.print("No Series Generated");
        }
        else{
            int i=1;
            int sum =0;
            while(i<=n){
                sum+=i;
                System.out.print(sum+" ");
                i++;
            }
        }
    }
}
