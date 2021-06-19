package com.연속된자연수의합;

import java.util.Scanner;

public class Main {

	public int solution(int n) {
		int answer = 0, sum=0, lt=0;
		int[] arr = new int[n/2+1];
		for (int i = 0; i < n/2+1; i++) arr[i]=i+1;
		for (int rt = 0; rt < n/2+1; rt++) {
			sum+=arr[rt];
			if(sum==n)answer++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n)answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(t.solution(n));
		kb.close();
	}
}
