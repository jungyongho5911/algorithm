package com.bit.opcode;
/*
 고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9 
정상 : 18.5 - 22.9 
저체중 : 18.5 미만 
if(18.5<= bmi && bmi <22.9)
 */

	import java.util.*;
public class Bmi {
	public void main() {
		Scanner s =new Scanner(System.in);
		int b = 0;
		System.out.print("인원수");
		b = s.nextInt();
		String avg = "";
		int i = 0;
		while(i<b) {
			String obesity="",res="",name="";
			double hei = 0.0,wei=0.0,bmi=0.0;
			boolean inputok = true;
			System.out.print("이름을입력하세요");
			name = s.next();
			System.out.print("키를입력하세요");
			hei = s.nextDouble()/100;
			System.out.print("체중을입력하세요");
			wei = s.nextDouble();
			bmi = wei/(hei*hei);
			if(bmi < 18.5 ) {
				obesity = "저체중";
			}else if(18.5<= bmi && bmi <22.9) {
				obesity = "정상";
			}else if(23<= bmi && bmi <24.9) {
				obesity = "과체중";
			}else if(25<= bmi && bmi <30) {
				obesity = "경도비만";
			}else if(30<= bmi && bmi <35) {
				obesity = "중등도비만";
			}else {
				inputok = false;
				obesity = "고도비만";
			}
			avg += String.format("[이름]%s [체질]%s\n",name,obesity);
			i++;
		}			
		System.out.print(avg);
}
}
