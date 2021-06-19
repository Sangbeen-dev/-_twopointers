package com.연속된자연수의합_수학;

import java.util.Scanner;

public class Main {

	public int solution(int n) {
		int answer = 0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
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
