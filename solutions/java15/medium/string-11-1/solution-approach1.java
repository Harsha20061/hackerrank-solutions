// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-11-1/problem?isFullScreen=true
// Problem     String 11 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 07:42 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max =0;
        char maxchar ='0';
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch)){
             continue;
             }
            int count =0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(count >max){
                max=count;
                maxchar=ch;
            }
        }
        System.out.println("The highest frequency of character:'"+maxchar+"'");
        System.out.println("appears number of times:"+max);
    }
}
