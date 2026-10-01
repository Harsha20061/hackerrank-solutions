// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-16-1/problem?isFullScreen=true
// Problem     String 16 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 08:40 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                res.append(Character.toUpperCase(ch));
            }
            else{
                res.append(ch);
            }
        }
        System.out.print(res.toString());
    }
}
