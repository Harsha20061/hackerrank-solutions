// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-18-1/problem?isFullScreen=true
// Problem     String 18 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-02, 10:10 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==' '){
                res.append(ch);
            }
        } 
        System.out.println(res.toString());
    }
}
