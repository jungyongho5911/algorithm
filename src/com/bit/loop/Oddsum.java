package com.bit.loop;
//1~100까지 홀수의합
//modular%
//1%2=1
//2%2=0
public class Oddsum {
	public  void main() {
		String t = "";
		int r = 0;
		for(int i=1; i<=99; i++ ) {
			if(i%2 == 1) {
				if(i == 99) {
					t += i+"=";
				}else {
					t += i+"+";
				}
				r += i;
			}
		}
		System.out.println(t+r);
	}
}
