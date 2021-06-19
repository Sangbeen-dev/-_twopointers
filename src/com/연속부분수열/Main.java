package com.연속부분수열;

import java.util.Scanner;

public class Main {

	public int solution(int N, int M, int[] arr) {
		int answer = 0, sum=0, lt=0;
		for (int rt = 0; rt < N; rt++) {
			sum+=arr[rt];
			if(sum==M) answer++;
			while(sum>=6) {
				sum-=arr[lt++];
				if(sum==M)answer++;
			}//while
		}//for
		
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int M = kb.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(t.solution(N, M, arr));
	}

}
