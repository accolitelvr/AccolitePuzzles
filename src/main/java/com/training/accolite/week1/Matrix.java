package com.training.accolite.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	
	private final Scanner sc;
	
	public int[][] solve(int[][] A) {
	    int xLength = A.length;
        int yLength = A[0].length;
        int[][] out = new int[xLength][yLength];
        for(int xScan=0;xScan<xLength;xScan++){
            for (int yScan=0;yScan<yLength;yScan++){
                int Count = count(A, xScan, yScan, xLength, yLength);
                if ((Count == 3) || (Count == 2 && A[xScan][yScan] == 1)) {
                    out[xScan][yScan] = 1;
                }
                else {
                    out[xScan][yScan] = 0;
                }
            }
        }
        return out;
	}

	int dis[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

	int count(int[][] A,int i,int j,int m,int n){
	    int cnt=0;
	    for(int k=0;k<8;k++){
	        int x= i+dis[k][0], y= j+dis[k][1];
	        if(x>=0 && y>=0 && x<m && y<n && Math.abs(A[x][y])==1) cnt++;
	    }
	    return cnt;
	}
	
	public Matrix() {
		this(new Scanner(System.in));
	}

	public Matrix(Scanner sc) {
		this.sc  = sc;
	}
	
	public int[][] run() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][]result= new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				result[i][j]=sc.nextInt();
			}
		}
		result = solve(result);
		for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
		return result;
	}
	
	public static void main(String[] args) {
		new Matrix().run();
	}
	
	
}
