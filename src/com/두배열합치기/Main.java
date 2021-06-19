package com.두배열합치기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public int[] solution(int[] a, int[] b) {
		int aSize = a.length;
		int bSize = b.length;
		int[] answer = new int[aSize+bSize];
		
		for (int i = 0; i < a.length; i++) {
			answer[i] = a[i];
		};
		for (int i = 0; i < b.length; i++) {
			answer[i+aSize] = b[i];
		}
		Arrays.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
				for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		
		for (int i : t.solution(a, b)) {
			System.out.print(i + " ");
		}
		
	}

}
