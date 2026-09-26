// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/arraydelete/problem?isFullScreen=true
// Problem     ArrayDelete
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 12:02 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    
    static void delete(int arr[],int n,int pos){
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
         } 
    }
    static void display(int arr[],int n ){
        for(int i =0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n+1];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos = sc.nextInt();
        if(pos<0||pos>n){
            System.out.println("Invalid Position");
            return;
        }
        delete(arr, n, pos);
        display(arr, n);
        
    }
}
