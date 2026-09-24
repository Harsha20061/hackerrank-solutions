// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/arrays18/problem?isFullScreen=true
// Problem     array18
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-24, 02:50 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       HashMap<Integer,Integer> freq = new HashMap<>();
       for(int i=0;i<n;i++){
        freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
       }
       for(int i=0;i<n;i++){
        if(freq.containsKey(arr[i])){
            System.out.println(arr[i] + " repeated " + freq.get(arr[i]) + " times ");
                freq.remove(arr[i]);
        }
       }
    }
}
