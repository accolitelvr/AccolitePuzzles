/*
package com.training.accolite.week1;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Stream;

public class Array {
	static long INF = (long)1e18;
    static int maxn = (int)1e6+5;
    static int mod= 1000000321 ;
    private final Scanner sc;

	
	public Array() {
		this(new Scanner(System.in));
	}

	public Array(Scanner sc) {
		this.sc  = sc;
	}
    public static void main(String[] args) {
        new Array().run();
    }
    
    public int run() {
		int result = solve();
		System.out.println(result);
		return result;
	}
 
    
    
    
    int solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[2*n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            a[i+n] = a[i];
        }
        
        int[] b = new int[maxn];
        for (int i = 1; i <= m; i++) {
            b[sc.nextInt()] = i;
        }
        
        int ans = 0;

        int[] relation = new int[2*n+1];
        for (int i = 1; i <= n; i++) {
            relation[i] = b[a[i]];
            relation[i+n] = b[a[i+n]] + a.length;
        }

        int temp = 0;
        for (int i = 2; i<=2*n; i++) {

            if (relation[i]> relation[i-1]) {
                temp =temp+ 1;
                if (temp > ans) {
                    ans = temp;
                }
            }
            else if (relation[i] == 0) {
                temp = 0;
            }
            else {
                temp = 1;
            }
        }

        return ans;
    }

}
*/
