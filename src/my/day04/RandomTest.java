package my.day04;

import java.util.Random;

/**
 * Random 클래스를 사용하여 1~3까지의 정수 난수를 생성하고 출력하시오
 * 
 * 난수를 출력해보는 프로그램
 */
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number=random.nextInt(3)+1;
		System.out.println("난수1: "+number);
		
		// 0~100까지의 난수 만들기
		int num=random.nextInt(101);
		System.out.println("난수2: "+num);
	}

}
