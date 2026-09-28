// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-8-1-2/problem?isFullScreen=true
// Problem     string 8 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-28, 11:44 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    static void count(char a[]){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alpha =0;
        int digits=0;
        int spec=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch >='A' && ch<='Z')||(ch>='a'&& ch<='z')){
                alpha++;
            }
            else if(ch>='0'&&ch<='9'){
                digits++;
            }
            else{
                spec++;
            }
        }
        System.out.println("Alphabets:"+alpha);
        System.out.println("Digits:"+digits);
        System.out.println("Special characters:"+spec);
    }
}
