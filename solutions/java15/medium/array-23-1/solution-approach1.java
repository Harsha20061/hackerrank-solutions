// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array-23-1/problem?isFullScreen=true
// Problem     Array23
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-27, 12:51 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    static void delete(int arr[],int n,int pos){
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos = sc.nextInt();
        delete(arr, n, pos);
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
