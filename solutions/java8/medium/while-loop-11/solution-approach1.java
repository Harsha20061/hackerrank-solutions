// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/while-loop-11/problem?isFullScreen=true
// Problem     while loop 11
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:47 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("No Series Generated");
        }
        else if(n>0){
            while(n!=0){
                System.out.print(n+" ");
                n--;
            }
            
        }
        else {
            while(n!=0){
                System.out.print(n+" ");
                n++;
            }
        }
        
    }
}
