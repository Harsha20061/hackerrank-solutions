// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-17-1-1/problem?isFullScreen=true
// Problem     String 17 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-02, 09:41 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            int count =0;
        for(int i=0;i<str.length()-2;i++){
             char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            char ch3 =str.charAt(i+2);
            if(ch1=='t'||ch1=='T'&&ch2=='h'||ch2=='H'&&ch3=='e'||ch3=='E'){
                
              boolean before = (i == 0 || str.charAt(i - 1) == ' ');

                
                boolean after = (i + 3 == str.length() || str.charAt(i + 3) == ' ');

                if (before && after) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
