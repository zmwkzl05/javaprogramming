package my.day04;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		number=input.nextInt();
		
		if(number%2==0) {
			System.out.println("입력된 정수는 짝수입니다.");
		}
		else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		/*
		if(number<0) {
			System.out.println("입력된 수는 음수입니다.");
		}
		else if(number==0) {
			System.out.println("입렬된 수는 0입니다.");
		}
		else {
			System.out.println("입력된 수는 양수입니다.");
		}*/
		System.out.println("프로그램이 종료되었습니다.");
		// 문자열을 비교는 '='를 사용못함 => eqrals라는 매소드 사용하여야 함
	}

}
