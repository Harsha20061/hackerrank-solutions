// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/for-loop10/problem?isFullScreen=true
// Problem     for loop10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-21, 10:26 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Imaginary Number");
        }else{
            
        int root =(int) Math.sqrt(n);
        System.out.println("square root of "+n+" is:"+root);
        }
    }
}
