// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/whileloops1/challenges/whild-loop-7/problem?isFullScreen=true
// Problem     while loop 7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 07:15 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("No Series Generated");
        }
        else if(num1<0 && num2 <0){
            int start = Math.min(num1,num2);
            int end = Math.max(num1,num2);
            if(start%2!=0){
                start++;
            }
            while(start<=end){
                System.out.print(start+" ");
                start +=2;
            }
        }
        else{
            int start = Math.max(num1 ,num2);
            int end = Math.min(num1,num2);
            if(start%2!=0){
                start--;
            }
            while(start>=end){
                System.out.print(start+" ");
                start-=2;
            }
        }
        }
    }
