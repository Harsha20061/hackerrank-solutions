// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array21/problem?isFullScreen=true
// Problem     array21
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 01:55 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        boolean found =false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isduplicate =false;
            for(int j=0;j<n;j++){
                if(j!=i && arr[i]==arr[j]){
                    isduplicate=true;
                    break;
                }
            }
        if(!isduplicate){
            System.out.print(arr[i]+" ");
            found=true;
            
        }
        }
        if(!found){
            System.out.println("No distinct element found");
        }
        
}
}
