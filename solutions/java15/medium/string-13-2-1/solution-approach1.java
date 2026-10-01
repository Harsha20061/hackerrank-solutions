// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/strings1/challenges/string-13-2-1/problem?isFullScreen=true
// Problem     String 13 2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-01, 08:04 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                
                if(arr[j]>arr[j+1]){
                    char temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                       
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(Character.isWhitespace(arr[i])){
                    continue;
                }
            System.out.print(arr[i]);
        }
        
    }
}
