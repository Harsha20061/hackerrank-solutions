// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/forloop12/problem?isFullScreen=true
// Problem     forloop12
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 09:30 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int fact=1;
        if(n<0){
            System.out.print("No Output Generated");
        }
        else if(n==0){
            
            System.out.print("The Factorial of 0:1");
        }
        else{
            for(int i=1;i<=n;i++){
                fact = fact*i;
                
            }
            System.out.print(fact);
            
        }
        
            }
}
