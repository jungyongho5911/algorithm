package com.bit.opcode;

import java.util.Scanner;

public class WhoAreyou {
	public void main() {
		Scanner s = new Scanner(System.in);
		String name = "";
		System.out.print("이름이 어떻게 되세요?\n");
		name = s.next();
		System.out.printf("내이름은 %s 입니다",name);
	}
}
