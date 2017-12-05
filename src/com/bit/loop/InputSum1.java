package com.bit.loop;

import java.util.Scanner;

public class InputSum1 {
	public  void main() {
		Scanner scanner = new Scanner(System.in);
		int a = 0, sum = 0;
		String b = "", c = "";
		while(true) {
			System.out.print("숫자입력");
			a = scanner.nextInt();
			System.out.println("연산자입력");
			b = scanner.next();
			switch(b) {
			case "+" :
				sum += a;
			break;
			case "-" :
				sum -= a;
			break;
			default :
				
			switch(b) {
			case "0" :
			System.out.println(sum);
			return;
			}
			}
		}	
		
	}
}
