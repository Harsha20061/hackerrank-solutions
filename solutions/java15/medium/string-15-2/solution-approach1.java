// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-15-2/problem?isFullScreen=true
// Problem     String 15 2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 08:23 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       String str2 = sc.nextLine();
       if(!str1.contains(str2)){
        System.out.println("Substring is not present in the string");
       }else{
        System.out.println("Substring is present in the string");
       }
    }
}
