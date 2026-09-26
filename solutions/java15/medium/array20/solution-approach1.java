// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array20/problem?isFullScreen=true
// Problem     array20
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 11:54 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    
    static void delete(int arr[],int n,int pos,int elem){
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
        int pos=-1;
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int elem = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==elem){
                 pos = i;
            }
        }
        if(pos<0){
            System.out.println("No element found to delete");
            return;
        }
        delete(arr, n, pos, elem);
        display(arr, n);
        
    }
}
