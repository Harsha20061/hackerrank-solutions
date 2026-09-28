// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-6-1-2/problem?isFullScreen=true
// Problem     string 6 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-28, 11:09 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str.isEmpty()){
            System.out.print(0);
        }
        else{
            String words[] =str.split("\\s+");
            System.out.print(words.length);
        }
    }
}
