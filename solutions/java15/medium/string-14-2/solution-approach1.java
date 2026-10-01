// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-14-2/problem?isFullScreen=true
// Problem     string 14 2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 08:15 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start =sc.nextInt();
        int length = sc.nextInt();
        for(int i=start;i<str.length();i++){
            if(length!=0){
            System.out.print(str.charAt(i));
            length--;
                
            }
        }
    }
}
