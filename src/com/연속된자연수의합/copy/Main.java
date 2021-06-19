package com.연속된자연수의합.copy;

import java.util.Scanner;

public class Main {

	public int solution(int n) {
		int answer = 0, sum=0, lt=0;
		for (int rt = 0; rt < n/2+1; rt++) {
			sum+=rt;
			if(sum==n)answer++;
			while(sum>=n) {
				sum-=lt++;
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
