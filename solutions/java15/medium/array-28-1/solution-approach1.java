// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array-28-1/problem?isFullScreen=true
// Problem     Array 28 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-27, 01:51 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
       for(int i=0;i<n;i++){
        int x = sc.nextInt();
        hm.put(x,hm.getOrDefault(x, 0)+1);
       }
       for(int x:hm.keySet()){
        if(hm.get(x)%2!=0){
            System.out.print(x+" ");
            
        }
       }
    }
}
