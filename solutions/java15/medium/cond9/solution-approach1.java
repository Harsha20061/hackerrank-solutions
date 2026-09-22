// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/basic-programs-01/challenges/cond9/problem?isFullScreen=true
// Problem     cond9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-22, 12:35 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age<13){
            System.out.print("Child age");
        }
        else if(age>20&&age<=25){
            System.out.print("Young age");
            
        }else if(age <20){
            System.out.print("Teen age");
            
        }
        
        else if(age<=40){
            System.out.print("Middle age");
        }
        else{
            System.out.print("Old age");
        }
        
    }
}
