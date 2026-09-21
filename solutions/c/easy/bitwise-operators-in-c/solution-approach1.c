// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/forloops1/challenges/bitwise-operators-in-c/problem?isFullScreen=true
// Problem     Bitwise Operators
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    c
// Status      Accepted
// Submitted   2026-09-21, 09:51 p.m.
// ──────────────────────────────────────────────────

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
    int maxAnd = 0;
    int maxOr = 0;
    int maxXor = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {

            int and = i & j;
            int or = i | j;
            int xor = i ^ j;

            if (and < k && and > maxAnd) {
                maxAnd = and;
            }

            if (or < k && or > maxOr) {
                maxOr = or;
            }

            if (xor < k && xor > maxXor) {
                maxXor = xor;
            }
        }
    }

    printf("%d\n", maxAnd);
    printf("%d\n", maxOr);
    printf("%d\n", maxXor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
