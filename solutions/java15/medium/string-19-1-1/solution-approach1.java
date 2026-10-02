// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-19-1-1/problem?isFullScreen=true
// Problem     string 19 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-02, 10:29 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count =0;
        for(int i=0;i<str.length();i++){
              char ch1 =str.charAt(i);
              if(ch1==ch){
                count++;
              }   
        }
        System.out.println(count);
    }
}
