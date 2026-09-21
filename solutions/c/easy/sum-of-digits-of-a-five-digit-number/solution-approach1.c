// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/sum-of-digits-of-a-five-digit-number/problem?isFullScreen=true
// Problem     Sum of Digits of a Five Digit Number
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    c
// Status      Accepted
// Submitted   2026-09-21, 10:33 p.m.
// ──────────────────────────────────────────────────

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    int sum =0;
    //Complete the code to calculate the sum of the five digits on n.
    while(n!=0){
        int r = n%10;
        sum=sum+r;
        n=n/10;
        
    }
    printf("%d",sum);
    return 0;
}
