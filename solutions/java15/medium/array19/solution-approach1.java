// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arraytest1/challenges/array19/problem?isFullScreen=true
// Problem     array19
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 11:36 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    static int insert(int arr[],int n,int pos,int elem){
        if(pos>n+1 || pos<=0){
            System.out.println("Invalid position");
            return -1;
        }
        for(int i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]= elem;
        return 1;
    }
    static void display(int arr[],int n ){
        for(int i =0;i<n;i++){
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
        int elem = sc.nextInt();
        int x = insert(arr, n, pos, elem);
        if(x==1){
            n++;
           display(arr, n);
        }
    }
}
