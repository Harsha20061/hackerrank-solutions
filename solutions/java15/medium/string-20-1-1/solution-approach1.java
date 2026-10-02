// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-20-1-1/problem?isFullScreen=true
// Problem     string 20 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-02, 10:48 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        char[] result = new char[str1.length()+str2.length()+1];
        for(int i=0;i<str1.length();i++){
            result[i]=str1.charAt(i);
        }
        result[str1.length()] = ' ';
        for(int i=0;i<str2.length();i++){
            result[str1.length()+1+i]=str2.charAt(i);
        }
        System.out.println(new String(result));
    }
}
