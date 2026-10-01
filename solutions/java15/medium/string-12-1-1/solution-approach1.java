// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-12-1-1/problem?isFullScreen=true
// Problem     String 12 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 07:49 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String arr[] = new String[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.next();
       }
       Arrays.sort(arr);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
