// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/basic-programs-01/challenges/print-odd-numbers-from-9-to-100/problem?isFullScreen=true
// Problem     Print Odd Numbers from 9 to 100
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-22, 12:41 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        for(int i = 9;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
