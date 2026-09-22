// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/basic-programs-01/challenges/switch1/problem?isFullScreen=true
// Problem     switch1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-22, 12:27 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n=Math.abs(n);
        switch(n){
        case 100:
        System.out.print("Police");
        break;
        case 101:
        System.out.print("Fire");
        break;
        case 102:
        System.out.print("Medical");
        break;
        case 108:
        System.out.print("Ambulance");
        break;
        default:
        System.out.print("Invalid Service");
        break;
        }
        
    }
}
