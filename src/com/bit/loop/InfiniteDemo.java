package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
	public  void main() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0정지,1.bmi");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : 
				System.out.println("시스템이종료되었습니다");
				return;
			case 1 : 
				break;
			}
			System.out.println("while loop종료");
			}
		}
	}

