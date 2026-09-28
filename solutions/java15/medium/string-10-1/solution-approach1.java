// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-10-1/problem?isFullScreen=true
// Problem     String 10 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-28, 11:53 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        int vowels=0;
        int consonents =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
                
            }else{
                consonents++;
            }
            }
            
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("consonants:"+consonents);
    }
}
