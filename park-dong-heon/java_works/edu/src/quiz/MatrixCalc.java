package quiz;

import java.util.Random;
import java.util.Scanner;

//class PrimeNumber {
//	
//}

public class MatrixCalc {
	
	private int[][] matrix =  {{ 1, 2, 3},
						 { 4, 5, 6},
						 { 7, 8, 9}};
	
	private void getMatrix() {
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix.length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println();
		
		System.out.print("행을 입력하시요 : ");
		int n = sc.nextInt();
		System.out.print("열을 입력하시요 : ");
		int m = sc.nextInt();
		
		matrix = new int[n][m];
		
//		행렬 입력(무작위 random값(1~9) 입력)
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = (int) (Math.random() * 9)+1;
			}
		}
		sc.close();	
	}
	
	public void work(boolean flag) { 
		if(flag) getMatrix();
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		
//		입력값 행렬 출력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		가로(열)의 합
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < m; j++) {
				sum += matrix[i][j];
			}
			System.out.println(i+1 + "행의 열의 총합 : " + sum);
		}
		
		System.out.println();
		
		
//		세로(행)의 합
		for(int i = 0; i < n ; i++) {
			int sum = 0;
			for(int j = 0; j < m ; j++) {
				sum += matrix[j][i];
			}
			System.out.println(i+1 + "열의 행의 총합 : " + sum);
		}
	}
}
