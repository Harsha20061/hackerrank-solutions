// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-3-4-2/problem?isFullScreen=true
// Problem     String 3 4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-28, 10:58 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count =0;
    for(int i =1;i<str.length()-1;i++){
        if (str.charAt(i) != '\'' && str.charAt(i) != '"') {
        count++;
        }
    }
    System.out.print(count);
    }
}
